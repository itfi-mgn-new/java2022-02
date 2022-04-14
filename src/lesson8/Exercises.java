package lesson8;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// S = "abcdefg"	-> "AbCdEfG"
		// 
		String	s = "abcdefg";
		String	r = "";
		int	i = 0;
		while (s.length() > 0) {
			if (i % 2 == 0) {
				r += s.substring(0,1).toUpperCase();
			}
			else {
				r += s.substring(0,1).toLowerCase();	
			}
			s = s.substring(1);
			i++;
		}
		System.err.println("R="+r);
		
		StringBuilder	sb = new StringBuilder();
		s = "abcdefg";
		
		for (int index = 0; index < s.length(); index++) {
			if (index % 2 == 0) {
				sb.append(Character.toUpperCase(s.charAt(index)));
			}
			else {
				sb.append(Character.toLowerCase(s.charAt(index)));
			}
		}
		System.err.println("Content: "+sb.toString());
		
		char[]	result = new char[s.length()];
		int		count = result.length-1;
		
		if (count % 2 == 0) {
			result[count] = Character.toUpperCase(s.charAt(count));
			count--;
		}
		while (count > 0) {
			result[count] = Character.toLowerCase(s.charAt(count));
			result[count-1] = Character.toUpperCase(s.charAt(count-1));
			count -= 2;
		}
		System.err.println("Res="+new String(result));
	}

}
