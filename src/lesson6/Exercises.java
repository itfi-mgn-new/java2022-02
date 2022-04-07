package lesson6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("C1="+Arrays.toString((int[])concat(new int[] {3,7}, new int[] {10,12,22})));
		System.err.println("C1="+Arrays.toString((double[])concat(new double[] {-2.5,3}, new double[] {-1.5,2.5})));
	}

	public static Object concat(Object... arrays) {
		// TODO: ...int[]... arrays
		int	totalLength = 0;

		for (Object /*int[]*/item : arrays) {
			totalLength += Array.getLength(item) /*item.length*/;
		}
		
		Object result = Array.newInstance(arrays[0].getClass().getComponentType()
										, totalLength);
		// int[] result = new int[totalLength];
		int from = 0;
		for (Object /*int[]*/ zzz : arrays) {
			int	len = Array.getLength(zzz); // zzz.length
			
			System.arraycopy(zzz, 0, result, from, len);
			from+=len;
		}
		return result;
	}
}
