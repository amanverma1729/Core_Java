package NotePadPrograms.day9;
// step 1 : 
import java.util.Scanner;
class UserInput
{

public static void main(String[] args)
{
// step 2 : 
Scanner sc = new Scanner(System.in);

// Task read an integer from user and print the square of it
 
System.out.println("Enter a number :" );
   int num = sc.nextInt();  // 4

   System.out.println(num + " sqaure is " + getSquare(num));


}


public static int getSquare(int a)
{
    return  a * a;
}


}