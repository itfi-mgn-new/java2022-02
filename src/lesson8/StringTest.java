package lesson8;

import java.util.Arrays;

public class StringTest {
	static String a = "a";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	x = "vassya";
		
		System.err.println("length="+x.length());
		System.err.println("x[0]="+x.charAt(0));
		System.err.println("Equals: "+x.equals("vAsSyA"));
		System.err.println("Equals no case: "+x.equalsIgnoreCase("vAsSyA"));
		System.err.println("Compare: "+x.compareTo("petya"));
		
		System.err.println("Index of: "+x.indexOf('a'));
		System.err.println("Index of: "+x.indexOf("as"));

		System.err.println("Starts with: "+x.startsWith("va"));
		System.err.println("Ends with: "+x.endsWith("ya"));
		System.err.println("Contains: "+x.contains("sy"));
		
		System.err.println("Substring: "+x.substring(2));
		System.err.println("Substring: {"+x.substring(2,3)+"}");
		System.err.println("Replace: "+x.replace('a','A'));
		System.err.println("Replace: "+x.replace("a",""));

		System.err.println("Replace: {"+x.replaceAll(".*","")+"}");

		// new StringBuilder().append("Replace: {")
		// .append(x.replaceAll(".*","")).append("}")
		// .toString();
		
		System.err.println("Split: "+Arrays.toString(x.split("a")));
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("sldklskd").toString();
		System.err.println("COntent: "+Arrays.toString(x.toCharArray()));
		System.err.println("Str: "+new String(new char[] {'a','b','c'}));
	}

}
