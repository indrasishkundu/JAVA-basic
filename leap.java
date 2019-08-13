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
public class leap {
     public static void main(String args[])
   {
    int y;
	Scanner sc=new Scanner(System.in);
                 System.out.print("\n Enter the year-->");
                y=sc.nextInt();
	if(y%100==0)
	{
		if(y%400==0)
                               {
		
			System.out.print("  "+y+" is   a leap year ");
                               }
		else
		{
			System.out.print(" "+y+" is not a leap year");
		}
	}
	else if(y%4==0)
	{
		System.out.print(" "+y+" is a leap year ");
	}
	else
	{
		System.out.print(" "+y+" is not a leap year");
	}
   }
    
}
