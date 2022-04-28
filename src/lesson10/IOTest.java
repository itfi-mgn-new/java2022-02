package lesson10;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte[] result = null;
		
		try(final Duration		d = new Duration();
			final OutputStream	os = new ByteArrayOutputStream(); //new FileOutputStream("c:\\temp/test.txt");
			final Writer		wr = new OutputStreamWriter(os)) {
			
			wr.write("test string");
			wr.flush();
			result = ((ByteArrayOutputStream)os).toByteArray();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // finally {
			// os.close();
			// d.close();
		// }

		try(final InputStream		is = new ByteArrayInputStream(result); //new FileInputStream("c:\\temp/test.txt");
			final Reader			rdr = new InputStreamReader(is);
			final BufferedReader	brdr = new BufferedReader(rdr)) {
			
//			byte[]	source = new byte[1000];
//			int		length, total = 0;
//			
//			while ((length = is.read(source)) > 0) {
//				total += length;
//			}

//			char[]	source = new char[1000];
//			int		length, total = 0;
//			
//			while ((length = rdr.read(source)) > 0) {
//				total += length;
//			}
			
//			final String	value = new String(source,0,total);
			final String	value = brdr.readLine();
			
			System.err.println("REad: "+value);	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	
	}
}

class Duration implements AutoCloseable {
	final long	startTime = System.currentTimeMillis();
	
	@Override
	public void close() throws RuntimeException {
		System.err.println("Duration="+(System.currentTimeMillis()-startTime));
	}
}

