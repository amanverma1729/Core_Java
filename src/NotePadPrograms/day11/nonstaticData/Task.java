package NotePadPrograms.day11.nonstaticData;

public class Task 
{
	double i = 45.0;   // non static 
	static String s = "java";
	public void task()
	{
		int i = 10;   // local
		 
		String s = "python";
		System.out.println(i);  // local
		System.out.println(this.i);
		
		System.out.println(s);  // local
		System.out.println(Task.s);
		
	}
	
	// this can not be use inside static method

}
