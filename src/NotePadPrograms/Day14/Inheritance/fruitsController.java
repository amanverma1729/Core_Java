package NotePadPrograms.Day14.Inheritance;

import java.util.Scanner;

public class fruitsController {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the fruit application ");
        System.out.println("Press 1 for apple");
        System.out.println("Press 2 for Banana");
        System.out.println("Press 3 for Mango");
        System.out.println("Press 4 for Exit");
        System.out.println("NOW... \nEnter you choice..");
        int input = sc.nextInt();
        
            
        
        if(input==1){
            Apple a = new Apple(101, "kashmiri Apple",100.0);
            System.out.println("Enter the Quantity");
            int qty=sc.nextInt();
            double totalPrice=(qty*a.price);
            int discount=199;
            double toGetDiscount=discount-totalPrice;
            

            if(totalPrice>discount){
                System.out.println("Original price:"+totalPrice);
                System.out.println("Congtrats! you got Rs.50 OFF fot the pruchasing above 199  ");
                System.out.println("The amount you have to piad "+(totalPrice-50));
                

            }
            else  {
                System.out.println("Total amount to be paid "+totalPrice);
                System.out.println("Add Items Rs."+toGetDiscount+" more to get Rs. 50 OFF ");
            }

        }
        
            
         
        
            
        
         if(input==2){
            Mango a = new Mango(101, "Mango type1 ",80.0);
            System.out.println("Enter the Quantity");
            int qty=sc.nextInt();
            double totalPrice=(qty*a.price);
            int discount=199;
            double toGetDiscount=discount-totalPrice;
            
            
            if(totalPrice>discount){
                System.out.println("Original price:"+totalPrice);
                System.out.println("Congtrats! you got Rs.50 OFF fot the pruchasing above 199  ");
                System.out.println("The amount you have to piad "+(totalPrice-50));
                

            }
            else {
                System.out.println("Total amount to be paid "+totalPrice);
                System.out.println("Add Items Rs."+toGetDiscount+" more to get Rs. 50 OFF ");
            }
            

        }
         if(input==3){
            Banana a = new Banana(101, "Banana ",50.0);
             System.out.println("Enter the Quantity");
            int qty=sc.nextInt();
            double totalPrice=(qty*a.price);
            int discount=199;
            double toGetDiscount=discount-totalPrice;
            if(totalPrice>discount){
                System.out.println("Original price:"+totalPrice);
                System.out.println("Congtrats! you got Rs.50 OFF fot the pruchasing above 199  ");
                System.out.println("The amount you have to piad "+(totalPrice-50));
                

            }
             else {
                System.out.println("Total amount to be paid "+totalPrice);
                System.out.println("Add Items Rs."+toGetDiscount+"more to get Rs. 50 OFF ");
            }

        
        }

        if(input==4){
            System.out.println("Thankyou for visting....\nCome Again");
            
        }
    
        

    }
}
