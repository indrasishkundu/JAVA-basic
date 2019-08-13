import java.util.*;
public class Prime{

    
    public static void main(String[] args) {
    int x=0,flag=0;
    Scanner sc= new Scanner(System.in);
     System.out.print("Enter a no---");
    x=sc.nextInt();
    for(int i=2; i<=x/2; i++)
    {
	if(x%i==0)
	{
		flag=1;
	}
     }
if(flag==0)
{
System.out.print("The no is prime");
}
else
{
System.out.print("The no is not prime");
}
}
}     