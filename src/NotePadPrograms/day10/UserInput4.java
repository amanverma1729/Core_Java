package NotePadPrograms.day10;
import java.util.Scanner;
class UserInput4
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);


System.out.println("Enter number "  );
int i = sc.nextInt();

sc.nextLine();  // dummy statement or clear buffer

System.out.println("Enter String "  );
String s = sc.nextLine();


System.out.println("------Detials-------------");
System.out.println("i = " + i);
System.out.println("s = " + s);


}

}