import java.util.*;
class Primecheck1{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
                 System.out.print("\n Enter the no-->");
              int  n=sc.nextInt(); 
Primecheck a=new Primecheck();
int k=a.check(n);
if(k==0)
{
System.out.print("The no is not prime");
}
else
{
System.out.print("The no is prime");
}
}
}