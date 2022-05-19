package lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpCilentTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		try(final Socket	sock = new Socket("localhost",2000);
			final InputStream	is = sock.getInputStream();
			final Reader		rdr = new InputStreamReader(is);
			final BufferedReader	brdr = new BufferedReader(rdr);
			final OutputStream	os = sock.getOutputStream();
			final PrintStream	ps = new PrintStream(os)) {
			
			ps.println("my test string");
			ps.flush();
			
			System.err.println("REsponse: "+brdr.readLine());
			
		}
	}

}
