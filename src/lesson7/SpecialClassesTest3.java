package lesson7;

import java.util.Arrays;

public class SpecialClassesTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfWeek dow = DayOfWeek.FRIDAY;
		Class	cl = dow.getClass();
	
		System.err.println("NAme="+cl.getName());
		System.err.println("sUPER="+cl.getSuperclass());
		System.err.println("Fields="+Arrays.toString(cl.getDeclaredFields()));
		System.err.println("COnstructors="+Arrays.toString(cl.getDeclaredConstructors()));

		System.err.println("dow NAme="+dow.name());
		System.err.println("dow seq="+dow.ordinal());

		System.err.println("Methods: "+Arrays.toString(SpecialClassesTest3.class.getDeclaredMethods()));
		
		System.err.println("Day: "+DayOfWeek.valueOf("MONDAY"));

		if (cl.isEnum()) {
			System.err.println("COntent: "+Arrays.toString(cl.getEnumConstants()));
		}
	
		
		switch (dow/*.ordinal()*/) {
			case FRIDAY/*.ordinal()*/:
				break;
			case MONDAY:
				break;
			case SATURDAY:
				break;
			case SUNDAY:
				break;
			case THURSDAY:
				break;
			case TUESDAY:
				break;
			case WEDNESDAY:
				break;
			default:
				throw new UnsupportedOperationException("Enum item ["
							+dow+"] is not supported yet");
		}
		
		for (DayOfWeek item : DayOfWeek.values()) {
			System.err.println("ENUM: "+item);
		}
	}

}