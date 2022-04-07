package lesson3;

public class ChildCallTest extends CallTest{
	static int	x = 10;
	int	y;
	
	ChildCallTest(int value) {
		super(value);
		y = value * 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallTest	cct1 = new ChildCallTest(1000), cct2 = new ChildCallTest(2000);
		
		cct1.staticPrint();
		cct1.instancePrint();
		cct2.instancePrint();
		
		//					this		VMT
		//	invokestatic	-			-
		//	invokevirtual	+			+
		//	invokespecial	+			-
		//	invokeinterface	+			+
		//
	}
	
	static void staticPrint() {
		System.err.println("x="+x);
	}
	
	@Override
	void instancePrint(/*CallTest this*/) {
		System.err.println("x="+x+",y="+this.y);
		super.instancePrint();
	}	

}
