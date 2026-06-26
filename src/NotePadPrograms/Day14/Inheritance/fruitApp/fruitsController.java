package NotePadPrograms.Day14.Inheritance.fruitApp;

import java.util.Scanner;

public class fruitsController {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the fruit application ");
        System.out.println("Press 1 for apple");
        System.out.println("Press 2 for Banana");
        System.out.println("Press 3 for Mango");
        System.out.println("Press 4 for PineApple");
        System.out.println("Press 5 for Guvava");
        System.out.println("press 6 to EXIT");
        System.out.println("NOW... \nEnter you choice..");
        int input = sc.nextInt();
  if(input==1){
            Apple a = new Apple(101, "kashmiri Apple",100.0);
            System.out.println("Base Price is: Rs. "+a.price);
            System.out.println("Enter the Quantity");
            int qty=sc.nextInt();
            a.toPrintBill(qty);

        }
        
         if(input==2){
            Mango m = new Mango(101, "Mango type1 ",80.0);
            System.out.println("Base Price is: Rs. "+m.price);
            System.out.println("Enter the Quantity");
            int qty=sc.nextInt();
            m.toPrintBill(qty);

        }
         if(input==3){
            Banana b = new Banana(101, "Banana ",50.0);
            System.out.println("Base Price is: Rs. "+b.price);
            System.out.println("Enter the Quantity");
            int qty=sc.nextInt();
            b.toPrintBill(qty);
        
        }
        if(input==4){
            PineApple p = new PineApple(input, null, input);
            System.out.println("Base Price is: Rs. "+p.price);
             System.out.println("Enter the Quantity");
            int qty=sc.nextInt();
            p.toPrintBill(qty);
        

        }
        if(input==5){
            Guvava g = new Guvava(input, null, input);
            System.out.println("Base Price is: Rs. "+g.price);
             System.out.println("Enter the Quantity");
            int qty=sc.nextInt();
            g.toPrintBill(qty);
        
        }

        if(input==6){
            System.out.println("Thankyou for visting....\nCome Again");
            
        }
    
        

    }
}
