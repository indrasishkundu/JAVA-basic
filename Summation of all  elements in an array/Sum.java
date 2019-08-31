import java.util.*;
class Sum{
	public static void main(String args[]){
		int x,sum=0,i;
		int arr[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no---->");
		x=s.nextInt();
		System.out.println("Enter array element-->");
		for(i=0;i<x;i++){
			arr[i]=s.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Summation=" +sum);
	}
}