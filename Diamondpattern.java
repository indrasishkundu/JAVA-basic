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
public class Diamondpattern {
    public static void main(String args[])
   {
       int i,row,j,k,l,m,n;
       Scanner sc = new Scanner(System.in);
	  System.out.print("Enter no of row-->");
	row=sc.nextInt();
	for(i=1;i<=row;i++)
	{
		for(j=row-1;j>=i;j--)
		{
			  System.out.print(" ");
		}
	k=i;
	for(l=1;l<=i;l++)
	{
		  System.out.print("*");
			
	k=k+1;
    }
    m=k-2;
    for(n=m;n>=i;n--)
    {
    	  System.out.print("*");
    	m=m-1;
	}
	for(j=1;j<= 2*(row-i)-1;j++)
	{
		  System.out.print("*");
	}	
	  System.out.print("\n");
	}
   }
}
