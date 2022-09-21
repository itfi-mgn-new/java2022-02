package lesson21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Runtime.getRuntime().addShutdownHook(
				new Thread(()->exit())
		);

		
		try(final Reader rdr = new InputStreamReader(System.in);
			final BufferedReader brdr = new BufferedReader(rdr)) {
		
			String	line;
			
			while((line = brdr.readLine()) != null) {
				System.out.println(line.toUpperCase());
			}
		}
	
	}

	private static void exit() {
		System.err.println("ALles!!!!!");
	}
}
