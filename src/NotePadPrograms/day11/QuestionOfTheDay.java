package NotePadPrograms.day11;

public class QuestionOfTheDay {
	
	public static void task1(int s1 , int s2)
	{
		
	}
	
	
	public static void getHighestMarksStudent(Student s1 , Student s2)
	{
		if(s1.marks > s2.marks)
		{
			// 
			System.out.println(s1.name + " has highest marks " + s1.marks);
		}else {
			// 
			System.out.println(s2.name + " has highest marks " + s2.marks);

		}
		
	}
	
	
	public static void task2(Product p1 , Product p2)
	{
		if(p1.price > p2.price)
		{
			System.out.println(p1.brandName + " has price " + p1.price);
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		Student student1 = new Student();
		student1.name = "Arjun";
		student1.marks = 78.5f;
		
		Student student2 = new Student();
		student2.name = "Teena";
		student2.marks = 88.7f;
		
		
		
		QuestionOfTheDay.getHighestMarksStudent(student1 , student2);
		
	}

}
