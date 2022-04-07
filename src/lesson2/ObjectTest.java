package lesson2;

import java.util.Arrays;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object	x = new Object();
		
		System.err.println("x="+x.toString());
		int[]	a1 = null
				, a2 = new int[10]
				, a3 = new int[] {2,3,4}
				, a4 = a3.clone();
		int[][]	aa1 = new int[][] {
							new int[] {4,5,6},
							null,
							/*new int[]*/{9,1}
						},
				aa2[] = new int[10][][];
						
		aa2[0] = new int[][]{null};
		
		for (int i : a3) {
			System.err.println("I="+i);
		}

		System.err.println("a3="+Arrays.toString(a3));
		
//		System.arraycopy(src, srcPos, dest, destPos, length);
		
		a2[0]=100;
		System.err.println("a4[0]="+a4[0]);
	}

}
