package NotePadPrograms.day8;
// Find out output of the program : 
class MethodExample7 {
public static void m1(int i) // i = 65
{
		System.out.println(demo(i, 60));
		// demo(65 , 60)
		// "6065 d"
	}
	public static char test(int i, int j) {
		System.out.println("Hello Java Class ");
		return 100; // 'd'
	}
	public static void main(String[] args) {
		System.out.println("Start Main"); //
		char ch = 'A';
		m1(ch); // m1('A')
		
		test(ch + 5, 20); // test('A' + 5 , 20)
						 //test(65 + 5 , 20)
							//test(70 , 20)
		//           'd'  -> no use
		demo(10, 20); // "2010 d"
		System.out.println("End Main");
	}
	public static String demo(int i, int j) 
	{  // int i = 10 , j = 20
		System.out.println(i + j); // 10 + 20
		return "" + j + i + " " + test(i, j);
		// "" + 20 + 10 + " " + test(10 , 20)
		// // "" + 20 + 10 + " " + 'd'
		// "2010 d"
		
	}
}