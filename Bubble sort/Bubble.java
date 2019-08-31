import java.util.*;
class Bubble{  
    static void bubblesort(int []arr, int n) { 
        int temp;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){   
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String args[]) {  
                int arr[]= new int[100];
				Scanner sc =new Scanner (System.in);
                 System.out.println("Enter how many nos-->");
				 int n=sc.nextInt();
				 System.out.println("Enter the nos-->");
				 for(int i=0;i<n;i++){
					arr[i]=sc.nextInt();
				 }
                bubblesort(arr,n);
                System.out.println("After Bubble Sort-->");
                for(int i=0; i <n; i++){  
                        System.out.println(arr[i] + " ");  
                }  
   
        }  
}  