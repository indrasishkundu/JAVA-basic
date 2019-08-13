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
public class oddnom2n {
    public static void main(String args[])
   {
       	int i,m,n;
              Scanner sc=new Scanner(System.in);
	System.out.print("enter first range-->");
	m=sc.nextInt();
	System.out.print("print odd nos till--> \n");
	n=sc.nextInt();
	  System.out.print(" all odd nos from "+m+" to "+n+" are--> ");
	i=m;
	while(i<=n)
	{
		 if((i%2)!=0)
		  {	
		  System.out.print("" + i +"\t");
	      }
	i=i+1;
	}
   }
    
    
}
