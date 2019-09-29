//exception
import java.util.*;
class Myexcept2{
	public static void main(String args[]){
		try{
		int arr[]=new int[5];
		System.out.println("Enter two no-->");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=x/y;
		System.out.println("Enter array elements --");
		arr[z]=sc.nextInt();
		System.out.println("z=" +z+ "\n Array element=" +arr[z]);
		System.out.println("Successfully Ended");
	}
catch(ArithmeticException e){
	System.out.println( "ArithmeticException caught  " +e+ "\nSuccessfully Ended :)");	
}
catch(ArrayIndexOutOfBoundsException e){
	System.out.println("ArrayIndexOutOfBoundsException caught " +e+ "\nSuccessfully Ended :)");
}
}
}

	