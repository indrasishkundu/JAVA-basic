import java.util.Scanner;
class S2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input-->");
		//System.out.println("Input 2-->");
		String s=sc.nextLine();
		String s1=sc.nextLine();
		System.out.println(s);
		System.out.println("length=" +s.length());
		s1=s1.concat(" ");
		System.out.println("O/P=" +s.concat(s1));
	}
}