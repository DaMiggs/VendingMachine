public class VendingMachine {

/**
* Operates the vending machine and displays messages based on the outcomes.
* @param keypad: the number entered by the customer on the keypad
* @param payment: the amount of money in dollars the customer paid
*/

public static int[] stock={0,5,5,5,5,5,0,5,5,5};
  
public static void vend(int keypad, double payment) {

  
if(keypad < 1 || keypad >9)
   {
       System.out.println("Selected an invalid item.");
       return;
   }
  
if(keypad>=1 && keypad<=6 )
       {

  System.out.println("Selected a valid item.");


           if(stock[keypad]>=1)
               {
                   if(payment>=1.25)
                   {
                       System.out.println("Payment was enough.");
                      
                       stock[keypad]--;
                      
                       System.out.println("Here is your item.");
                   }
                   else
                   {                          
                       System.out.println("Payment was not enough.");
                      
                       System.out.println("You get nothing.");
                   }
               }
           else
               {
                     System.out.println("You get nothing.");
               }
       }
      
   if(keypad>=7 && keypad<=9)
       {

System.out.println("Selected a valid item.");


           if(stock[keypad]>=1)
               {
                   if(payment>=1.50)
                   {
                       System.out.println("Payment was enough.");
                      
                       stock[keypad]--;
                      
                       System.out.println("Here is your item.");
                      
                   }
                   else
                   {                          
                       System.out.println("Payment was not enough.");
                      
                       System.out.println("You get nothing.");
                   }
               }
           else
               {
                   System.out.println("You get nothing");
               }
       }
  
return;
}

public static void main(String[] args)
{
   vend(12,1.50);
}
}
