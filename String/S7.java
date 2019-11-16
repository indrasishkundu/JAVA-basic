import java.util.Scanner;
class S7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input-->");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.compareTo(s2)>0){
			System.out.println("2nd string comes first");
		}
		else if(s1.compareTo(s2)<0)
		{
			System.out.println("1st string comes first");
	    }
		else{
			System.out.println("Both are same");
		}
	}
}