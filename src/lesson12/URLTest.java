package lesson12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URL;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;


public class URLTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final URL	url = new URL("http://localhost:8001/test/test1?q=a");
	
		HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 8001), 0);
		server.createContext("/test", new  MyHttpHandler());
		server.start();
		
		HttpURLConnection	conn = (HttpURLConnection)url.openConnection();
		
		conn.setRequestMethod("POST");
		conn.setRequestProperty("X-MyKey", "X-MyValue");
		
		try(final InputStream	is = conn.getInputStream();
			final Reader		rdr = new InputStreamReader(is);
			final BufferedReader	brdr = new BufferedReader(rdr)) {
			
			String	line;
			
			while ((line = brdr.readLine()) != null) {
				System.err.println("line="+line);
			}
			
		} finally {
			server.stop(0);
		}
		conn.disconnect();
	
	}
}
