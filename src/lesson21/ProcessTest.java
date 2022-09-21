package lesson21;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.lang.ProcessBuilder.Redirect;

public class ProcessTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
//		final ProcessBuilder	pb = new ProcessBuilder("java","-jar","test.jar");
		final ProcessBuilder	pb = new ProcessBuilder("C:/windows/system32/mspaint.exe");
		
		pb.directory(new File("C:\\Program Files\\Far Manager\\"));
//		pb.redirectError(Redirect.INHERIT);
//		pb.redirectOutput(Redirect.INHERIT);
//		pb.redirectInput(Redirect.INHERIT);

		
		final Process	p = pb.start();

//		final OutputStream os = p.getOutputStream();
//		
//		os.write("dir\n".getBytes());
//		os.flush();
//		
//		try(final InputStream is = p.getInputStream();
//			final Reader	rdr = new InputStreamReader(is);
//			final BufferedReader	brdr = new BufferedReader(rdr)) {
//			
//			String line;
//			while((line = brdr.readLine()) != null) {
//				System.out.println(line);
//			}
//		}
		
		int rc = p.waitFor();

		System.err.println("Rc="+rc);
	}

}
