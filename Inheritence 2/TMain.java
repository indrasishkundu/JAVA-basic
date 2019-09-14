//code for inheritence
class TwoD{
	int length,breadth;
}
class Rectangle extends TwoD{
	Rectangle(int a, int b){
		length=a;
		breadth=b;
	}
	void areaRectangle(){
		System.out.println("area of rectangle=" +length*breadth);
	}
}
class Triangle extends TwoD{
	Triangle(int a, int b){
		length=a;
		breadth=b;
	}
	void areaTriangle(){
		System.out.println("area of triangle=" + 0.5*length*breadth);
	}
}
	class TMain{
		public static void	main(String args[]){
			Triangle t=new Triangle(5,7);
			t.areaTriangle();
			Rectangle r=new Rectangle(5,7);
			r.areaRectangle();
		}
	}		