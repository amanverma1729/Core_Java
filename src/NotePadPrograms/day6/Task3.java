/*
WAJP to create 1 float type var and 1 double type of var as local vars
Now perform multiplication with both vars and store the result

*/

class Task3
{
   public static void main(String[] args)
   { 
     float n1 = 2.5f;
     double n2 = 1.0;
     double result = n1 * n2;  
     float result2  = (float)(n1 * n2);  // double
     int result3 = (int)(n1 * n2);  // double

    System.out.println(result);
    System.out.println(result2);
 System.out.println(result3);


     

   }


}