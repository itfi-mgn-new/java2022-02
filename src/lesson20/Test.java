package lesson20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.err.println("Hello world: "+Arrays.toString(args));
		System.err.println("Props: "+System.getProperties());
		System.err.println("Temp dir: "+System.getProperty("java.io.tmpdir"));
		System.err.println("Key: "+System.getProperty("key"));
	
		try(final Reader rdr = new InputStreamReader(System.in);
			final BufferedReader brdr = new BufferedReader(rdr)) {
		
			String	line;
			
			while((line = brdr.readLine()) != null) {
				System.out.println(line.toUpperCase());
			}
		}
	
	}

}
