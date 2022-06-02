package lesson14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Create file with:
		//		tanya
		//		manya
		//		petya
		//		tanya
		// 2. Read it, remove duplicates 
		//    and print it in the alphabet order
	
		// 1. Create file with:
		//		abizjan
		//		susleg
		//		medved
		//		kote
		//		susleg
		//		varon
		//		arol
		// 2. Read it and print:
		//		arol - 1
		//		susleg - 2
		//		etc...
	
		final Map<String,int[]> counter = new HashMap<>();
		
		for (String item : new String[] {"abizjan", "susleg", "medved", "kote", "susleg", "varon", "arol"}) {
			if (!counter.containsKey(item)) {
				counter.put(item, new int[] {0});
			}
			counter.get(item)[0]++;
		}
		for (Entry<String, int[]> item : counter.entrySet()) {
			System.err.println(item.getKey()+" - "+item.getValue()[0]);
		}
	}
}
