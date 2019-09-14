import java.util.*;
class MyPrivate
{
   
   public 
             String name="Sidharth";
             String sex ="Male";
             boolean indian = true;
            
   private 
               long phnumber =8162093411L;
               String image="IMAGE";
               String aadhaar="4444 3333 2222";
              
   public void membership(int rupees,boolean A)
   {
     if( rupees >5000 && A ==true)
     {
     System.out.println("image : "+image);
     System.out.println("Aadhaar number : " +aadhaar);
     System.out.println("Ph.no.  : "+phnumber);
     }
     else{
          if(A == false)
            {
              System.out.println("\nWithout your aadhaar card you can't access private data ");
             }         
           if(rupees<=5000)
             {
            System.out.println("\nYou have to pay money to get private data");
            System.out.println("\nPay more than Rs.5000");
              }
           }
   }
}

class MyProfile
{
   public static void main(String arg[])
   {
     Scanner sc = new Scanner(System.in);
    System.out.print("\nPay more than Rs.5000 to get private data :");
    int amount = sc.nextInt();
    System.out.print("\nDo you have  aadhaar card ('yes'->1/ 'no'->0 :");
   int a_value =sc.nextInt();
   boolean a_card;

     if(a_value == 1)
           a_card = true;
     else
             a_card = false;

     MyPrivate s = new MyPrivate();
     System.out.println("name : " +s.name);
     System.out.println("sex : " +s.sex);
     System.out.println("Indian : " +s.indian);
     s.membership(amount,a_card);
    }
}