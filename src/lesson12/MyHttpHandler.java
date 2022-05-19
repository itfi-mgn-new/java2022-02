package lesson12;

import java.io.IOException;
import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class MyHttpHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange ex) throws IOException {
		// TODO Auto-generated method stub
		System.err.println("Call: "+ex.getRequestMethod()+" "+ex.getRemoteAddress()+" "+ex.getRequestURI());
		ex.sendResponseHeaders(200, 7);
		try(final OutputStream	os = ex.getResponseBody()) {
			os.write("SUCCESS".getBytes());
			os.flush();
		}
		
	}

}
