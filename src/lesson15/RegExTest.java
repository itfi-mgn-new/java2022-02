package lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Pattern	p = Pattern.compile("1(\\d(3))");
		
		Matcher	m = p.matcher("193");
//		System.err.println("MAtch? "+m.matches());
		System.err.println("Find? "+m.find());
		System.err.println("Group? "+m.group());
		System.err.println("Group? "+m.group(1));
		System.err.println("Group? "+m.group(2));
		
	}

}
