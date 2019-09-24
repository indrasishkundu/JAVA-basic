//create a parent class MusicalInstrument that has two subclasses String Instrument and Drum.The string class again has two  child-->Guitar , ektara.Similarly, Drum type has two child class tabla and dhol.
//The Instrument has the property sound generation.The instrument has the extra property no of strings.The subclass drum has the extra property no of string .the subclass drum has the extra property surface area for knock.
//all the subclasses guitar ektara  tabla dhol has their own mechanism for generating sound
class MusicalInstrument{
	int sound;
	int melody;
}
class StrInstrument extends MusicalInstrument{
	//StrInstrument(int nostrings, int tun){
		//sound=nostrings;
		//melody=tun;
		
	//}
	void Sangeet1(){
		System.out.println("generated sound="  +( 0.9*sound*melody));
	}
}
	class Drum extends MusicalInstrument{
		//Drum(int knock , int dum){
			//sound=knock;
			//melody=dum;
			
		//}
		void Sangeet2(){
			System.out.println("generated sound=" +(8.5+sound+melody));
		}
	}
		
	class Guitar extends StrInstrument{
		int nos=5;
		Guitar(int nostrings, int tun){
			sound=nostrings;
		melody=tun;
		}
		void Sangeet3(){
			System.out.println("generated sound="  +( 0.9*nos*sound*melody));
		}
	}
	class Ektara extends StrInstrument{
		int nos=6;
		Ektara(int nostrings, int tun){
		sound=nostrings;
		melody=tun;
		}
		void Sangeet4(){
			System.out.println("generated sound="  +( 0.9*nos*sound*melody));
		}
	}
	class Tabla extends Drum{
		int knk=55;
		Tabla(int knock , int dum){
		sound=knock;
		melody=dum;	
		}
		void Sangeet5(){
			System.out.println("generated sound=" +(knk+8.5+sound+melody));
		}
	}
	class Dhol extends Drum{
		int knkk=23;
		Dhol(int knock , int dum){
		sound=knock;
		melody=dum;	
		}
		void Sangeet6(){
			System.out.println("generated sound=" +(knkk+8.5+sound+melody));
		}
	}
	
public class MainInstrument{
public static void main(String args[]){
Dhol t=new Dhol(2,5);
Ektara e=new Ektara(2,3);
e.Sangeet4();
t.Sangeet6();	

}
}