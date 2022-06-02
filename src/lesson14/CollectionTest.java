package lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>	l = new ArrayList<String>();
		
		System.err.println("Size: "+l.size());
		l.add("vassya");
		l.add(0,"petya");
		l.add("vassya");
		System.err.println("Size: "+l.size());
		System.err.println("Value[0]="+l.get(0));	// array[i]
		for (Object item : l) {
			System.err.println("Item: "+item);
		}
		Object result = l.remove(0);
		System.err.println("Deleted: "+result);
		System.err.println("Size: "+l.size());
		for (String item : l) {
			System.err.println("Item: "+item);
		}
		l.set(0, (String)"igor");	// array[0] = "igor";
		for (String item : l) {
			System.err.println("Item: "+item);
		}
		
		l.addAll(Arrays.asList("10", "20", "30"));
		System.err.println("New Size: "+l.size());
		for (String item : l) {
			System.err.println("Item: "+item);
		}

		System.err.println("----------------------------");
		
		Set<String> s = new HashSet<>();
		
		System.err.println("Size: "+s.size());
		s.add("vassya");
		s.add("petya");
		s.add("vassya");
		System.err.println("Size: "+s.size());
		for (String item : s) {
			System.err.println("Item: "+item);
		}
		System.err.println("vassya? "+s.contains("vassya"));
		System.err.println("igor? "+s.contains("igor"));
		s.remove("vassya");
		System.err.println("Size: "+s.size());
		for (String item : s) {
			System.err.println("Item: "+item);
		}

		Set<String>  s1 = new HashSet<>();
		s1.addAll(Arrays.asList("tanya","manya","petya"));
		
		s.addAll(s1);
		System.err.println("Size add: "+s.size());
		for (String item : s) {
			System.err.println("Item: "+item);
		}

		Set<String>  s2 = new HashSet<>();
		s2.addAll(Arrays.asList("tanya","petya"));
		
		s.retainAll(s2);
		System.err.println("Size intersect: "+s.size());
		for (String item : s) {
			System.err.println("Item: "+item);
		}

		Set<String>  s3 = new HashSet<>();
		s3.addAll(Arrays.asList("tanya","manya"));
		
		s.removeAll(s3);
		System.err.println("Size minus: "+s.size());
		for (String item : s) {
			System.err.println("Item: "+item);
		}
	}

}
