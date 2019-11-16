/*perform a searching if the search element is not present then the code automatically throws an exception.In the exception 
handling mechanism, It performs re-search*/
import java.util.Scanner;
class Sth{
public static void main(String args[]){	
try{ 
int c, first, last, middle, n, search;
int arr[]=new int[100];
 Scanner p=new Scanner(System.in);
	System.out.println("Enter number of elements-->");
	n=p.nextInt();
  System.out.println("Enter "+n+" integers-->");
   for (c = 0; c < n; c++)
      arr[c]=p.nextInt();
   System.out.println("Enter value to find-->");
 search=p.nextInt();
   first = 0;
   last = n - 1;
   middle = (first+last)/2;
   while (first <= last) {
      if (arr[middle] < search)
         first = middle + 1;    
      else if (arr[middle] == search) {
       System.out.println(""+search+" found at location " +(middle+1)+" ");
         break;
      }
      else
         last = middle - 1;
 
      middle = (first + last)/2;
   }
}
    catch(Exception e){
   if (first > last)
      System.out.println("Not found! "+search+" isn't present in the list");

	}
}
}



	
