package InterviewPrograms.BasicNumberProgram;

import java.util.Scanner;

/*

1. Check whether a number is even or odd.
2. Find the largest of two numbers.
3. Find the largest of three numbers.
4. Swap two numbers using a third variable.
5. Swap two numbers without using a third variable.
6. Check whether a number is positive, negative, or zero.
7. Find the factorial of a number.
8. Print the multiplication table of a number.
9. Find the sum of first N natural numbers.
10.Find the sum of digits of a number.

*/
public class BasicNumberSol{
    
    //1. Check whether a number is even or odd.
    public static void isEvenOrOdd(int n ){
        if(n%2==0){
            System.out.println("number is even");
        }
        else
            System.out.println("Number is odd");

    }

    //2. Find the largest of two numbers
    public static void largestOfTwoNumber(int i, int j){
        if (i>j) {
           System.out.println(i+" is greatest number"); 
        }
        else
        System.out.println(j+" is largest number");
    }
    
    // 3. Find the largest of three numbers.
    public static void largestOfThreeNumber(int i , int j, int k){
        if(i>j && i>k){
            System.out.println(i+" is the kargest number from the given three number.");
        }
        else if(j>i&&j>k){
            System.out.println(j+" is the largest number from the given three number.");
        }
        else
            System.out.println(k+"is the is largest number from the given three number.");
    }

    // 4. Swap two numbers without using a third variable.
    public static void swapWithout3rdVariable(int i, int j){
        System.out.println("before swapping: ");
        System.out.println("i = "+i+"\tj= "+j);
        i=i+j;
        j=i-j;
        i=i-j;
         System.out.println("after swapping: ");
        System.out.println("i = "+i+" \tj= "+j);
    }


    // 5. Swap two numbers using a third variable.
    public static void swap2NumberUsing3rdVar(int i , int j){
        System.out.println("Before Swapping: ");
        System.out.println("i = "+i+"\tj = "+j);
        int temp =i;
        i=j;
        j=temp;
        System.out.println("====================================");
        System.out.println("After Swapping: ");
        System.out.println("i = "+i+"\tj = "+j);
    }



    //  6. Check whether a number is positive, negative, or zero.
    public static void isNumberPostiveNegativeZero(int i){
        if (i==0) 
            System.out.println("number is equal to Zero: ");
        
        else if (i<0) 
            System.out.println("Number is negative ");
        else
            System.out.println("number is positive"+i);

            
        
    }



    // 7. Find the factorial of a number.
public static void factorial(int n){
    if (n==1) {
        System.out.println("factorial is "+n);
    }
   if(n>0){
      long factorial =1;
        for (int i=1;i<=n;i++){
         factorial = factorial*i;
    
         
        
         
        
    } 
    System.out.println("Factorial is "+factorial);
    }
   

   }
      




    // 8. Print the multiplication table of a number.
    public static void multiply(int n ){
        for(int i =1; i<=10;i++){
            int multi = i*n;
            System.out.println(i+" * "+n+" = "+multi);;
        }
    }


    // 9. Find the sum of first N natural numbers.
    public static void sumOfNaturalNumber(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
            

        }
        System.out.println("The sum of the nth natural number is "+sum);
    }




    // 10.Find the sum of digits of a number.
    public static void sumOfDigit(int n){
        int sum=0;
       if(n<=9 && n>0){
            System.out.println("sum is "+sum);
            
        
        else if (n>9){ 
        for(int i =0; i<=n%10;i++){
            int digit  = n /10;
            sum+=digit;
        }
        System.out.println("sum of the digit is "+sum);
    }

        else
         System.out.println("enter a valid number");
    
    
    
}

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int a = sc.nextInt();
        // isEvenOrOdd(a);
        // largestOfTwoNumber(10,50);
        // largestOfThreeNumber(50 ,900, 58);
        // swapWithout3rdVariable(-8, 70);
        // swap2NumberUsing3rdVar(10, 20);
        // isNumberPostiveNegativeZero(-15);
        // factorial(7);
        // multiply(5);
        // sumOfNaturalNumber(5);
        sumOfDigit(15);

        
    }

}