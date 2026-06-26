package NotePadPrograms.Day14.Inheritance.fruitApp;

public class Fruit {
    int fruitId;
    String name;
    double price;

    public Fruit (int fruitId, String name , double price){
        this.fruitId=fruitId;
        this.name=name;
        this.price=price;


    }
 public void toPrintBill(int qty){
      double totalPrice=(qty*price);
            int discount=199;
            double toGetDiscount=discount-totalPrice;
            

            if(totalPrice>discount){
                System.out.println("Original price:"+totalPrice);
                System.out.println("Congtrats! you got Rs.50 OFF fot the pruchasing above 199  ");
                System.out.println("The amount you have to paid is: "+(totalPrice-50));
                System.out.println("Thankyou for shoping! Visit again");
                

            }
            else  {
                System.out.println("Total amount to be paid "+totalPrice);
                System.out.println("Add Items Rs."+toGetDiscount+" more to get Rs. 50 OFF ");
                 System.out.println("Thankyou for shoping! Visit again");
                
            }  

 }
}


