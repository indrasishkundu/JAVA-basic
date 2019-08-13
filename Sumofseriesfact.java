/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progs;
import java.util.*;
/**
 *
 * @author Indrasish
 */
public class Sumofseriesfact {
     public static void main (String args[])
    {
        int j,i,n,f;
	double  sum=0.0;
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter last element:\n");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		if(i!=n)
                                            	System.out.print("1/"+i+"!+");
                          else
			System.out.print("1/"+i+"!=");
		f=1;
		for(j=1;j<=i;j++)
		{
			f=f*j;
		}
		sum=sum+(1.0)/f;
	}
	System.out.print(" "+sum+" ");
    }
    
}
