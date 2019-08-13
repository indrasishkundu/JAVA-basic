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
public class binarytodec {
    public static void main (String args[])
    {
        int num,bin,dec=0,base=1,r;
                  Scanner sc=new Scanner(System.in);
	System.out.println("Enter a binary no(1 & 0s)-->");
	num=sc.nextInt();
	bin=num;
	while(num>0)
	{
		r=num%10;
		dec=dec+r*base;
		num=num/10;
		base=base*2;
	}
                System.out.println("the binary equivalent is "+bin+" \n");
	System.out.print("the decimal equivalent is "+dec+" \n");
    }
    
}
