import java.util.Scanner;
class S5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input-->");
		String s=sc.nextLine();
		System.out.println("O/P-->" +s.substring(4));
		System.out.println(s.toUpperCase());
		System.out.println("O/P-->" +s.substring(4,9));
		/*4 to <9*/
	}
}