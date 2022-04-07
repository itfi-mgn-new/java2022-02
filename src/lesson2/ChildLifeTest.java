package lesson2;

public class ChildLifeTest extends LifeCycleTest {
	static final int	x = 100;				// ConstValue x<-100
	static final double	y = Math.random()+10;
	
	static {
		System.err.println("Child Lifecycle init");
	}
	
	final int		z = 1000;
	final double	t = -1234567;
	
	{
		System.err.println("Child LifeCycle instance");
	}
	
	public ChildLifeTest() {
		this(123);
		
		System.err.println("My child constructor");
	}

	public ChildLifeTest(int zzz) {
		super(zzz);
		// java.lang.LifeCycleTest(110);
		System.err.println("My child constructor");
	}
	
	public static void main(String[] args) {
		System.err.println("Hello world: "+x);
		ChildLifeTest	clt = new ChildLifeTest();
		
		System.err.println("z="+((LifeCycleTest)clt).z);
		clt = null; // new ChildLifeTest();
	}
}
