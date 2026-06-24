package NotePadPrograms.day11.nonstaticData;

public class Controller2 {
	
	public void add(int n , int m)
	{
		int result = n + m;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int c = a+b;
		
		System.out.println(c);
		
		System.out.println("-----");
		
		int i = 20;
		int j = 50;
		
		int d = i + j;
		
		System.out.println(d);
		
		System.out.println("----");
		
		Controller2 obj = new Controller2();
		
		obj.add(10,20);
		
		obj.add(20, 50);
	}

}
