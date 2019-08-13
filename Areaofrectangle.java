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
public class Areaofrectangle {

   public static void main (String[] args)
   {
	   Scanner sc = new Scanner(System.in);
           
	   System.out.println("Enter the length of Rectangle:");
           
	   double length = sc.nextDouble();
	   System.out.println("Enter the width of Rectangle:");
	   double width = sc.nextDouble();
	
	   double area = length*width;
	   System.out.println("Area of Rectangle is:"+area);
   }
}
    

