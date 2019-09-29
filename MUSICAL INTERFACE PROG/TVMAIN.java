/*Two interfaces Musical_Instrument and Digital_Instrument contain methods sound and signal.A television is a musical
instrument and also a digital instrument that inherites both the two interfaces. a sony bravia is a premium television
that has aspect ratio of 4:3 , sound speaker of 40W, electric pulse consumption of 220v.CREATE A JAVA CODE FOR THE ABOVE 
SITUATION.*/

interface Musical_Instrument{
	public void sound();
	public void signal();
}
interface Digital_Instrument{
	public void sound();
	public void signal();
}
class prop{
 void tvprop(){
	System.out.println("This is SONY BRAVIA TV");
	System.out.println("This television has an aspect ratio of 4:3");
 }
	
}
class Sony_Bravia extends prop implements Musical_Instrument,Digital_Instrument{
	public void sound(){
		System.out.println("It has got sound speaker of 40W");
	}
	public void signal(){
		System.out.println("Electric pulse consumption for the particular device is 220V");
	}
}
class TVMAIN{
	public static void main(String args[]){
		Sony_Bravia t=new Sony_Bravia();
		t.tvprop();
		t.sound();
		t.signal();
	}
}
	