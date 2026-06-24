package NotePadPrograms.day11.nonstaticData;

public class Student {
	int id;
	String name;
	int age;

	public void setData(int i, String n, int a)
	{ 
		
		id = i;  // id = 104
		name = n;
		age = a;
	}
	
	public void displayInfo()
	{
		System.out.println("Name : " + name);
		System.out.println(" id  : " + id);
		System.out.println("Age  : " + age);
	}
	

}
