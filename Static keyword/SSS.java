class Understandstatic{
	static int x=7;
	int y;
	static void meth(){
		System.out.println("Static Method");
	}
	void meth1(){
		System.out.println("Non-static method");
	}
}
class SSS{
	public static void main(String args[]){
		System.out.println(Understandstatic.x);
		Understandstatic.meth();
		//system.out.println(understamdstaic.y);
		//Understandstatic.meth1();
	}
}