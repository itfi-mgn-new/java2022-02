package lesson11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try(final OutputStream	os = new FileOutputStream("c:/temp/test.obj");
			final ObjectOutputStream	oos = new ObjectOutputStream(os)) {
			
			oos.writeBoolean(true);
			oos.writeLong(123);
			oos.writeDouble(12.3);
			House	addr = new House("lenina 1");
			Human[] h = new Human[] {new Human("ivanov", "ivan", "ivanovich", 22, addr), new Human("petrov", "petr", "petrovich", 21, addr)};
			
			oos.writeObject(new Human("ivanov", "ivan", "ivanovich", 22, addr));
//			oos.reset();
			oos.writeObject(new Human("petrov", "petr", "petrovich", 21, addr));
			oos.writeObject(h);
			oos.flush();
		}
		
		try(final InputStream	is = new FileInputStream("c:/temp/test.obj");
			final ObjectInputStream	ois = new ObjectInputStream(is)) {
			
			System.err.println("Boolean: "+ois.readBoolean());
			System.err.println("Long: "+ois.readLong());
			System.err.println("Double: "+ois.readDouble());
			Human	h1 = (Human) ois.readObject();
			System.err.println(h1);
			Human	h2 = (Human) ois.readObject();
			System.err.println(h2);
			Human[]	h3 = (Human[]) ois.readObject();
			System.err.println(Arrays.toString(h3));
			
		}
		
	}

}
