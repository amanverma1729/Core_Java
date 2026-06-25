package NotePadPrograms.day6;
class TypeCastingExample
{

// Activity 2
public static void main(String[] args)
{
  
   int num = 'a';  // character --> Integer Value (ASCII)
		   // 'a' -> 97

  System.out.println(num);

  // or

  char ch = 'a';

  int num2 = ch; // Widening --> implicit

  System.out.println(num2);


}


} 