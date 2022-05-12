package lesson11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.print.attribute.standard.PrinterStateReasons;

public class ZipTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(final OutputStream	os = new FileOutputStream("c:/temp/test.zip");
			final ZipOutputStream	zos = new ZipOutputStream(os)) {
			
			ZipEntry	ze = new ZipEntry("part1");
			
			ze.setMethod(ZipEntry.DEFLATED);
			
			zos.putNextEntry(ze);
			zos.closeEntry();
			
			ze = new ZipEntry("part2");
			
			ze.setMethod(ZipEntry.DEFLATED);
			
			zos.putNextEntry(ze);
			
			PrintStream ps = new PrintStream(zos);
			
			ps.println("Test string");
			ps.flush();
			
			zos.closeEntry();
		}
		
		try(final InputStream		is = new FileInputStream("c:/temp/test.zip");
			final ZipInputStream	zis = new ZipInputStream(is)) {
	
			ZipEntry	ze;
			
			while((ze = zis.getNextEntry()) != null) {
				System.err.println(">>>>>>> Name="+ze.getName());
				
				Reader	rdr = new InputStreamReader(zis);
				BufferedReader	brdr = new BufferedReader(rdr);
				
				String	line;
				
				while ((line = brdr.readLine()) != null) {
					System.err.println(line);
				}
			}
			
		}
	}

}
