/*
WAJP to create 2 non static variables of character type having alpha
Now inside main method perfrom addition with characters and store the rseult
*/

class Task2
{
 char c1 = 'A';
 char c2 = 'd';

public static void main(String[] args)
{
 Task2 obj = new Task2();
   
int  sum = obj.c1 + obj.c2;  // 'A' + 'd' -> 65 + 100 => 165

 String      concatResult = obj.c1 +"" +  obj.c2;



System.out.println("first character : " + obj.c1 + "," + "Second Character  : "  + obj.c2 + "\n" + "Thier Addition result is " + sum );

System.out.println("first character : " + obj.c1 + "," + "Second Character  : "  + obj.c2 + "\n" + "Thier concatination result is " + concatResult );




}


}