package lesson15;

import java.io.File;
import java.util.Arrays;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File	f = new File("./");
		
		System.err.println("Where? "+f.getAbsolutePath());
		System.err.println("Exists? "+f.exists());
		System.err.println("Is directory? "+f.isDirectory());
		System.err.println("Is file? "+f.isFile());
		System.err.println("Can read? "+f.canRead());
		System.err.println("Content: "+Arrays.toString(f.listFiles()));

		File	subdir = new File(f,"mydir");
		
		System.err.println("Exists? "+subdir.exists());
		System.err.println("Created: "+subdir.mkdirs());

		File	newSubdir = new File(f,"mynewdir");
		
		System.err.println("Exists before? "+subdir.exists());
		System.err.println("Exists? "+newSubdir.exists());
		System.err.println("REnamed: "+subdir.renameTo(newSubdir));
		System.err.println("Exists after? "+subdir.exists());
		System.err.println("Exists? "+newSubdir.exists());
		
		System.err.println("Deleted: "+subdir.delete());
		System.err.println("Exists after? "+subdir.exists());
		System.err.println("Deleted: "+newSubdir.delete());
		System.err.println("Exists? "+newSubdir.exists());
		
	}

}
