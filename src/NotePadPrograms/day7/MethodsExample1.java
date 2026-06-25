package NotePadPrograms.day7;
class MethodsExample1
{

public static void main(String[] args)
{
   System.out.println("Main method " );
   MethodsExample1.addition(10,20); // actual args--> args
   
}


public  static void  addition(int a , int b) // formal args--> Paramters
{
 
   System.out.println("addition method " );
   int sum = a + b;
   System.out.println(a + "  + " + b + " = " + sum);

}




}