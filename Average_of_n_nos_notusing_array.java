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
public class Average_of_n_nos_notusing_array {
    public static void main(String args[])
   {
    int i,n,Sum=0,numbers;
  float Average;

   Scanner sc = new Scanner(System.in);
  System.out.print("\nPlease Enter How many Number you want?\n");
  n=sc.nextInt();
 
  System.out.print("\nPlease Enter the elements one by one\n");
  for(i=0;i<n;++i)
   {
  numbers=sc.nextInt();
     Sum = Sum +numbers;
   }
 
  Average = Sum/n;
 
  System.out.print("\nSum of the "+n+" Numbers =  "+Sum+" ");
  System.out.printf("\nAverage of the "+n+" Numbers = "+Average+" ");
       
   }
}
