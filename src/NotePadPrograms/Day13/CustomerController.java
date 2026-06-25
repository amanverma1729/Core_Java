package NotePadPrograms.Day13;

public class CustomerController {
    
 public static Customer youngestCustomer(Customer c1 , Customer c2, Customer c3){
         if(c1.getAge()<c2.getAge()&&c1.getAge()<c3.getAge()){
        return c1;
    }
    else if(c2.getAge()<c1.getAge()&&c2.getAge()<c3.getAge()){
        return c2;
    }
    else{
         return c3;
    }
   }
public static void main(String[] args) {
    Customer c1 = new Customer();
    c1.setName("Raju");
    c1.setAge(22);
    // System.out.println("First Customer Details:");
    // c1.getName();
    // c1.getAge();

    Customer c2 = new Customer();
    c2.setName("Ajay");
    c2.setAge(25);
    // System.out.println("Second Customer Details:");
    // c2.getName();
    // c2.getAge();

    Customer c3 = new Customer();
    c3.setName("Raj");
    c3.setAge(28);
    // System.out.println("Third  Customer Details:");
    // c3.getName();
    // c3.getAge();
   
    Customer youngest=youngestCustomer(c1, c2, c3);
    System.out.println(youngest.getName() + " is the youngest having age " + youngest.getAge()
);
  

}

}
