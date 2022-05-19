package lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(final ServerSocket	ss = new ServerSocket(2000)) {
			
			for (;;) {
				try(final Socket		s = ss.accept();
					final InputStream	is = s.getInputStream();
					final Reader		rdr = new InputStreamReader(is);
					final BufferedReader	brdr = new BufferedReader(rdr);
					final OutputStream	os = s.getOutputStream();
					final PrintStream	ps = new PrintStream(os)) {
					
					String	line;
					
					while ((line = brdr.readLine()) != null) {
						System.err.println("Receive: "+line);
						ps.println(line.toUpperCase());
						ps.flush();
					}
				}
			}
		}
	}
}
