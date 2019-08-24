class Conschain{
	Conschain(){
		System.out.print("Cons with no args");
	}
Conschain(int x){
this();
System.out.print("Cons with 1 arg");
}
Conschain(int x, int y)
{
	this(x);
	System.out.print("Cons with 2 args");
}
}
class Mythis1{
	public static void main(String args[]){
		Conschain n=new Conschain(5,7);
	}
}
	
