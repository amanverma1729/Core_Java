package NotePadPrograms.day6;
class TypeCastingExample2
{

// Activity 3
public static void main(String[] args)
{
  int num = 97;

  byte b;
 short s;
 long l;
 float f;
double d;
char ch;


    b = (byte)num;  // int to byte --> narrowing -> Explicit

    s = (short)num; // int to short --> narrowing --> Explicit
 
    l = num;  // int to long --> widening --> implicit

    f = num ; // int to float --> widening  --> implicit
   
    d = num ; // int to double --> widening  --> implicit

    ch = (char)num; // int to char -->narrowing --> Explicit

    System.out.println("Original Integer number is : " + num);
    System.out.println("byte ->" + b);
    System.out.println("short ->" + s);
   System.out.println("long ->" + l);
System.out.println("float ->" + f);
System.out.println("double ->" + d);
System.out.println("char ->" + ch);






   
}


} 