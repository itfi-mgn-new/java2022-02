package lesson7;

@MyAnnotation(dow = DayOfWeek.FRIDAY, stringVal = "sjhdfkjhkj")
public class SpecialClassesTest4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class	cl = SpecialClassesTest4.class;
		
		MyAnnotation	ma = (MyAnnotation)cl.getAnnotation(MyAnnotation.class);
	
		System.err.println("dow: "+ma.dow());
		System.err.println("str: "+ma.stringVal());
		System.err.println("int: "+ma.intVal());
		if (ma.dow().isHolyday()) {
			throw new Exception("beri shinel idi domoy"); 
		}
	}

}
