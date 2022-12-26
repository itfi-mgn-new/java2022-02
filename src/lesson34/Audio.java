package lesson34;

import java.io.IOException;
import java.io.InputStream;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

// https://docs.oracle.com/javase/tutorial/sound/overview-MIDI.html
public class Audio {
//	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
//		// TODO Auto-generated method stub
//		playWav();
//		playMidi(false);
//		playMidi(true);
//	}

	public static void startPlayWav() {
		final Thread	t = new Thread(()->playWav());
		
		t.setDaemon(true);
		t.start();
	}
	
	public static void startPlayMIDI(final boolean soundType) {
		final Thread	t = new Thread(()->playMidi(soundType));
		
		t.setDaemon(true);
		t.start();
	}

	// https://habr.com/ru/post/211480/
	public static void playMidi(final boolean soundType) {
		try{final Synthesizer	synth = MidiSystem.getSynthesizer();
		
			synth.open();
			final MidiChannel[]	channels = synth.getChannels();
			
//			channels[9].programChange(41);
			channels[9].noteOn(soundType ? 65 : 36, 50);
			Thread.sleep(1000);
			channels[9].noteOff(36);
			synth.close();
		} catch (MidiUnavailableException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	private static void playWav() {
		try(final InputStream 		is = Audio.class.getResourceAsStream("sample.wav");
			final AudioInputStream	ais = AudioSystem.getAudioInputStream(is)) {
			final AudioFormat 		audioFormat = ais.getFormat();
			final DataLine.Info 	info = new DataLine.Info(SourceDataLine.class, audioFormat);
			
			try(final SourceDataLine	line = (SourceDataLine)AudioSystem.getLine(info)) {
				final byte[]			buffer = new byte[8192];
				int						length;
				
//				line.addLineListener(new MyListener());
				line.open(audioFormat);
				line.start();
				while((length = ais.read(buffer)) > 0) {
					line.write(buffer, 0, length);
				}
				line.flush();
				line.stop();
			}
		} catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
		}
	}
}

//class MyListener implements LineListener {
//    @Override
//    public void update(final LineEvent event) {
//        if (event.getType() == LineEvent.Type.START) {
//            System.err.println("Playback started.");
//        } 
//        else if (event.getType() == LineEvent.Type.STOP) {
//            System.err.println("Playback completed.");
//        }
//    }
//}
