class MethodExample4
{
public static void main(String[] args)
{
	MethodExample4.task();  // method call
                  //  task(8);  // task(int) invalid

MethodExample4 obj = new MethodExample4();
obj.demo();


double num = 5.6;
run(num);  // run(5.6)
run(num + 2); // run(5.6 + 2) --> run(7.6)

byte a = 12;
run(a);  // run(12)

char ch = 'a';
run(ch);  // run('a')


code("java" , 20); // CTE
}

public static void code(int i , String s) // int  i = "java"
{

System.out.println("Code Method body");

}





public static void run(double i)// double i = 'a' --> 97 -> 97.0
{
  System.out.println("run method body");

}




public static void task()
{
  System.out.println("Task method body");
}

public  void demo()
{
  System.out.println("demo method body");

}


}