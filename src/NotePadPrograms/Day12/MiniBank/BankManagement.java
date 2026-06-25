package NotePadPrograms.Day12.MiniBank;

import java.util.Scanner;
public class BankManagement {
    String name;
    long phoneNo;
    int pin;
    double balance;

    public BankManagement(String name,long phoneNo, int pin, double balance){
        this.name=name;
        this.phoneNo=phoneNo;
        this.pin=pin;
        this.balance=balance;

    }
    public static void  getUserInfo(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the User name: ");
        String name=sc.nextLine();
        System.out.println("Enter the phone number: ");
        long phoneNo=sc.nextLong();
     }    

    
  

    
}
