abstract class Parent{
	abstract void meth();
		void meth1(){
			System.out.println("General method");
		}
	}
	class Child extends Parent{
void meth(){
System.out.println("Abstract method overriding");
}
}
class PMain{
	public static void main(String args[]){
		Child c=new Child();
		c.meth();
		c.meth1();
	}
}
	