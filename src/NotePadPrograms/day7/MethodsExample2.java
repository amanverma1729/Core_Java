class MethodsExample2
{


public static void main(String[] args)
{
MethodsExample2.isEvenNumber(20);  // Method call
MethodsExample2.isEvenNumber(23);  // Method call

}

// Method Declaration + body
public static void  isEvenNumber(int num)  // int num = 20
{
  
  int rem = num % 2;   // 20  % 2 -> 0

   if(rem  == 0) // 0 == 0 -> true
   {
    System.out.println("Yes, " + num + " is Even Number");
    }
    else
   {
	//System.out.println("No, " + num + " is not Even Number");
     System.out.println(num + " is Odd Number");


    }

}


}