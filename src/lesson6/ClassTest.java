package lesson6;

import java.lang.reflect.Array;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class	cl = ClassTest.class;
		Object	z = new int[] {2,5,7};
		
		Class	cla = z.getClass();
		System.err.println("IS array? "+cla.isArray());
		System.err.println("Component="+cla.getComponentType());
		
		System.err.println("LEngth: "+Array.getLength(z));
		System.err.println("x[0]="+Array.getInt(z, 0));
		Array.setInt(z, 0, 300);
		System.err.println("Value:"+((int[])z)[0]);
		double[] dz = (double[])Array.newInstance(double.class, 3);
		
		System.err.println("DOuble len="+dz.length);
	}

}
