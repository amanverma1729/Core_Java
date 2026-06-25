package NotePadPrograms.day8;
// WAJP to give last digit of a number
// WAJP to check last digit is even or not
// 
class MethodExample6
{

public static void main(String[] args)
{
int d = getLastDigit(1234);  // 4

isEven(d);

}

public static int getLastDigit(int num)
{
  int digit =   num % 10;
  //System.out.println(digit);
  return digit;
}

public static boolean isEven(int num)
{
    if(num % 2 == 0)
   {
     //System.out.println(true);
      return true;
   } 
   else
   {
    // System.out.println(false);
   return false;
   }
}




/*
Take a number
divide number by 10 and get the remainder by using %
and store it

now , print or return 


*/




}

