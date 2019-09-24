interface I{
	public void meth();
	public void meth1();
}
class Interclass{
	public void cmeth(){
		System.out.println("\n Method of class");
	}
}
class TestInter extends Interclass implements I{
	public void meth(){
		System.out.println("1st method of Interface");
	}
public void meth1(){
	System.out.println("2nd method of Interface");
}
}
class InterMain{
	public static void main(String args[])
	{
		TestInter a= new TestInter();
		a.meth1();
		a.meth();
		a.cmeth();
	}
}
	