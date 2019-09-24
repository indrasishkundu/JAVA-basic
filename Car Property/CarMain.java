/*Create a Base class car that has 3 basic properties -1.No of wheels=4,2.Engine=1,3.Steering=1
and abstract methods-->1.Sitting capabilities 2.Engine capacity 3.Max torque. three subclasses-->1.Hatchback2.Sedan3.SUV
inherites the class car .the sitting capability of hatchback and sedan is 5, for SUV it is 7....HONDA city is a sedan 
that generates torque with 115nm and has engine capacity 1599cc.Alto 800 is a hatchback that has torque 75nm and engine capacity
799cc.
CREATE A SUITABLE JAVA CODE TO SHOW THE FEATURES OF ALTO 800 AND HONDA CITY */
abstract class Car{
	
	int no_of_wheels=4;
	int engine=1;
	int steering=1;
	abstract void sitting();
	abstract void enginecap();
	abstract void max_torque();
}
abstract class Hatchback extends Car{
void sitting(){
System.out.println("This vehicle can accommodate 5 persons");
}
}
abstract class Sedan extends Car{
void sitting(){
System.out.println("This vehicle can accommodate 5 persons");
}
}
abstract class SUV extends Car{

void sitting(){
System.out.println("This vehicle can accommodate 7 persons");
}
}

class Alto800 extends Hatchback{
void enginecap(){
System.out.println("This is alto 800");
System.out.println("This car has got engine capacity of 799cc");	
}
void max_torque(){
	System.out.println("This car has got max torque of 75Nm");
}
}
 class HondaCity extends Sedan{	
void enginecap(){	
System.out.println("This is Honda City");
System.out.println("This car has got engine capacity of 1599cc");	
}
void max_torque(){
	System.out.println("This car has got max torque of 115Nm");
}
}
class LandRoverLux extends SUV{
void enginecap(){
	System.out.println("This is LandRover Luxury evo");
System.out.println("This car has got engine capacity of 1999cc");	
}
void max_torque(){
	System.out.println("This car has got max torque of 450Nm");
}
}	

public class CarMain{
	public static void main(String args[]){
		HondaCity h=new HondaCity();
		h.enginecap();
		h.max_torque();
		h.sitting();
		System.out.println();
		Alto800 a=new Alto800();
		a.enginecap();
		a.max_torque();
		a.sitting();
		System.out.println();
		LandRoverLux l=new LandRoverLux();
		l.enginecap();
		l.max_torque();
		l.sitting();
	}
}
		