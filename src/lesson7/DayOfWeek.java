package lesson7;

public /*final*/ enum DayOfWeek {
	MONDAY(false),// = new DayOfWeek("MONDAY",0,false),
	TUESDAY(false), //= new DayOfWeek("TUESDAY",1),
	WEDNESDAY(false), //= new DayOfWeek("MONDAY",2),
	THURSDAY(false), //= new DayOfWeek("MONDAY",3),
	SATURDAY(true), //= new DayOfWeek("MONDAY",4),
	FRIDAY(false), //= new DayOfWeek("MONDAY",5),
//	SATURDAY, //= new DayOfWeek("MONDAY",5),
	SUNDAY(true); // = new DayOfWeek("SUNDAY",6),
	
	private final boolean isHolyday;
	
	DayOfWeek(boolean isHoliday) {
		this.isHolyday = isHoliday;
	}
	
	public boolean isHolyday() {
		return isHolyday;
	}
	
//	enum ZZZ {
//		SSSSS;// = ZZZ("SSSSS",0);
//	}
}