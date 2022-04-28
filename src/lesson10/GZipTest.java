package lesson10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.zip.GZIPOutputStream;

public class GZipTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try(final OutputStream	os = new FileOutputStream("c:/temp/z.gzip");
			final GZIPOutputStream gzos = new GZIPOutputStream(os);
			final PrintStream	ps = new PrintStream(gzos)) {

			for (int index = 0; index < 1000000; index++) {
				ps.println("URA!!!!!");
			}
			ps.flush();
		}
	}

}
