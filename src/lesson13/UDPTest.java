package lesson13;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Thread	t = new Thread(()->callReceive());
		t.setDaemon(true);
		t.start();
		
		for (int index = 0; index < 100; index++) {
			final int temp = index;
			Thread	tt = new Thread(()->callSend(2001+temp));
			tt.setDaemon(true);
			tt.start();
		}
		
		Thread.sleep(20000);
	}

	private static void callReceive() {
		byte[]	buffer = new byte[1000];
		int		count = 0;
		
			try(final DatagramSocket	ds = new DatagramSocket(2000)) {
				final DatagramPacket	dp = new DatagramPacket(buffer, buffer.length);
				
				for(;;) {
					ds.receive(dp);
//					Thread.sleep(1);
					System.out.println("receive "+new String(buffer,0,dp.getLength())+", count="+count);
					count++;
				}
			} catch (IOException /*| InterruptedException*/ e) {
				e.printStackTrace();
			}
	}

	private static void callSend(int port) {
		byte[]	buffer = ("test string "+port).getBytes();
		
		for (int index = 0; index < 100; index++) {
			try(final DatagramSocket	ds = new DatagramSocket(port)) {
				final DatagramPacket	dp = new DatagramPacket(buffer
											, buffer.length
											, new InetSocketAddress("localhost", 2000));
				
				ds.send(dp);
				System.err.println("Sent "+port);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
