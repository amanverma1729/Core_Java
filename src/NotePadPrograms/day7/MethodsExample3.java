class MethodsExample3
{

public static void main(String[] args)
{

MethodsExample3.checkLastDigit(1345); 
MethodsExample3.votingVerification(16);  // 

MethodsExample3.votingVerification(19);  // 
MethodsExample3.checkLastDigit(1347);  // 


}

public static void checkLastDigit(int num)
{

  int lastDigit = num % 10; 
  if( lastDigit == 7)
  {
	System.out.println("Yes, " + num + " ends with 7");
  }
  else
  {
	System.out.println( num + " does not end with 7");
  }

}



public static void votingVerification(int age)
{

   if( age >= 18)
  {
	System.out.println("Yes, you can vote! ");
  }
  else
  {
	System.out.println(  "Wait for sometime!!");
  }

}




}