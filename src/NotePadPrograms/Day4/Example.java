package NotePadPrograms.Day4;
class Example
{
  static int a ;  // static var --> belongs to class
        double b;   // non static (instance var) --> belongs to object
  
 public static void main(String[] args)
 {
    int i;  // Local var
    i = 10;
    System.out.println("i = " + i);
    System.out.println("a = " + a);
  // or 
  // Call static variable by Using className.varName
  System.out.println("a = " + Example.a);

  Example obj = new Example();

  System.out.println("b = " + obj.b);

 }

}