package lesson3;

public class CallTest {
	static int	x = 10;
	
	int	y;
	
	CallTest(/*CallTest this,*/int value) {
		this.y = value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final CallTest	ct1 = new CallTest(100), ct2 = new CallTest(200);
		
		CallTest.staticPrint();
		ct1.instancePrint(/*ct1*/);
		ct2.instancePrint(/*ct2*/);
	}

	static void staticPrint() {
		System.err.println("x="+x);
	}
	
	void instancePrint(/*CallTest this*/) {
		System.err.println("x="+x+",y="+this.y);
	}
}
