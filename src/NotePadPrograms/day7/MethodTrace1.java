package NotePadPrograms.day7;
// find out output of this program
class MethodTrace1 {
	public static void m1() {
		char ch = 'd';
		System.out.println(ch + 'A');		
	}
	public static void m2() {
		MethodTrace1.m1(); 
	}
	public static void main(String[] args) {
		System.out.println("Main method starts : ");
		MethodTrace1.m3();
		System.out.println("Main method ends : -");
	}
	public static void m3() {
		char data = 'e';
		double i = data;   
		String s = "java";
		System.out.println(i + data + s + i);			
		MethodTrace1.m2(); 
	}
}