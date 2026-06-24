import java.util.Scanner;
class UserInput2
{

public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter name : ");
 String n = sc.next();
System.out.println("Enter age : ");

int a = sc.nextInt();
   
printDetails(n , a);

}


public static void printDetails(String name , int age)
{
  System.out.println("Name\t:\t" + name);
  System.out.println("Age\t:\t" + age);

}



}