import java.util.*;
class D{
	public static void main(String args[]){
		int r,c;
		int arr[][];
		System.out.println("Enter row & col-->");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		c=sc.nextInt();
		arr=new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix element");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
	}
		
		
}