package lesson4;

public class InterfaceTest {
	private static int a = 100;
	
	public static void printA() {
		System.err.println("a: "+a);
	}
	
	public static void printA(int delta) {
		System.err.println("a+delta: "+(a+delta));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceTest	it = new InterfaceTest();
		it = new ChildInterfaceTest();
//		it = new ZZZ();
		MyInterface	mi;// = new InterfaceTest();
		mi = new ChildInterfaceTest();
		mi = new ZZZ();
	}

	static void callPrint(MyInterface m) {
		m.print();
	}
	
	public void print() {
		// ...
	}
	
//	public void print3() {}
}

class ChildInterfaceTest extends InterfaceTest implements MyInterface, MyInterface1 {

	@Override
	public void print1() {
		// TODO Auto-generated method stub
		
	}
	// void print();

	@Override
	public void print3() {
		// TODO Auto-generated method stub
		MyInterface.super.print3();
	}
}

interface MyInterface {
	/*public static final*/ int x = 10;
	/*public abstract */void print();
	default void print3() {
		// ,,,,,,
	}
	
	static void staticPrint() {
		// ....
	}
}

interface MyInterface1 {
//	void print1();
//	void print3();
}

interface MyInterface2 extends MyInterface, MyInterface1 {
	// void print();
	// void print1();
	void print2();
	// void print3();
}

class ZZZ implements MyInterface {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}