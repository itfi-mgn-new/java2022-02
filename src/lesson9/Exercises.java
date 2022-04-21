package lesson9;

public class Exercises {
	static String[]		families = {
							"ИВАНОВ  Иван иванович",
							"Петров петр петрович",
							" сидоров Сидор сидорович  ",
							"Иванова Фекла дормидонтовна"
						};	// Иванов Иван Иванович
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int index = 0; index < families.length; index++) {
			final String[]		parts = families[index].split(" ");
			final StringBuilder	sb = new StringBuilder();
			
			for(String item : parts) {
				if (!item.isEmpty()) {
					sb.append(' ')
						.append(Character.toUpperCase(item.charAt(0)))
						.append(item.substring(1).toLowerCase());
				}
			}
			System.err.println(sb.substring(1));
		}
	}

	static String inWords(int value) {
		StringBuilder	sb = new StringBuilder();
		
		if (value >= 1000000000) {
			sb.append(inWords(value / 1000000000, maleUnits, milliards));
			value %= 1000;
		}
		if (value >= 1000000) {
			sb.append(inWords(value / 1000000, maleUnits, millions));
			value %= 1000000;
		}
		if (value >= 1000) {
			sb.append(inWords(value / 1000, femaleUnits, thousands));
			value %= 1000;
		}
		if (value > 0) {
			sb.append(inWords(value, maleUnits, none));
		}
		return sb.toString();	
	}
	
	static String inWord(int value, String[] units, String[] measure) {
		return "";
	}
	
}
