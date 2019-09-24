class TwoD{
	int length,breadth;
TwoD(int x,int y){
	length=x;
	breadth=y;
}
void show(){
	System.out.println("length=" +length+ "\n breadth=" +breadth);
}
}
class Rectangle extends TwoD{
	Rectangle(int a,int b){
		super(a,b);
	}
	void showArea(){
System.out.println("Area=" +length*breadth);
	}
}
class SuperCons{
public static void main(String args[]){
Rectangle r=new Rectangle(3,2);
r.show();
r.showArea();
}
}
	