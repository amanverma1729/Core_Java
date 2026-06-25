
package NotePadPrograms.day7;
// find out output of this program
class MethodTrace2 {
  static double  i ;   // i = 0.0 --> 1.0 --> 2.0
  static String s ;   // s = null --> "null60 " --> "null60 100.0 "

public static void task(int a) // int a = 60
{
     i = i + 1; //    0.0 + 1 => 1.0
     System.out.println(i  * a);  // 1.0 * 60 -> 60.0
     s = s + a + " "; // null + 60 + " " -> "null60 "
}
public static void main(String[] args) {
  System.out.println("i = " + i + "\n" + "s = " + s ); // i = 0.0 new Line s = null
  run('2');   // method call
  System.out.println("i = " + i + "\n" + "s = " + s );
  // i = 2.0 new line s = "null60 100.0 "

}
public static void test(double b)  // b = 100.0
{
      i = i + 1;  // 1.0 + 1 -> 2.0 
     System.out.println(i * b); // 2.0 * 100.0 --> 200.0
     s = s + b + " "; // "null60 " + 100.0 + " " -> "null60 100.0 "
 
}
public static void run(char ch)  // ch = '2'
{
   task(ch + 10);  // method Call task('2' + 10) -> task(50 + 10) -> task(60)

   test(ch + 50); // method call test('2' + 50) -> test(50 + 50) -> test(100)
}	
}