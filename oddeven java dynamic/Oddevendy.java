import java.util.*;
public class Oddevendy{

    
    public static void main(String[] args) {
     int x;
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter a no---");
     x=sc.nextInt();
     if(x%2==0)
     {
         System.out.print("The no "+x+" is even");
     }
     else
     {
         System.out.print("The no "+x+" is odd");
     }
    }
    
}
