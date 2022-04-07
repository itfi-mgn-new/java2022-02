package lesson2;

import java.util.Arrays;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]	a = {1,2,3,4,5}, b = {6,7,8,9,10}, 
				c = new int[a.length+b.length];
		
		// concatenate a and b and store it into c
		// c = {1,2,3,4,5,6,7,8,9,10}
		int		from = 0;
		//int[][]	zzz1 = new int[][] {a,b};
		
		// for (int index = 0; index < zzz1.length; index++) {
		// int[] zzz = zzz1[index];
		for (int[] zzz : /*zzz1*/new int[][] {a,b}) {
			System.arraycopy(zzz, 0, c, from, zzz.length);
			from+=zzz.length;
		}
		// }
//		System.arraycopy(a, 0, c, from, a.length);
//		from+=a.length;
//		System.arraycopy(b, 0, c, from, b.length);
//		from+=a.length;
		System.err.println("Content: "+Arrays.toString(c));
		
	}

}
