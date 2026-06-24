package NotePadPrograms.day11.nonstaticData;

public class Controller1 {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		
		// initialize states of a Student object
		
		// by using direct refernce variable
		s1.id = 101;
		s1.name = "Riya";
		s1.age = 25;
		
		s1.displayInfo();
		
		System.out.println("-------------");
		// by using non static methods
		
		Student s2 = new Student();
		s2.setData(103, "Teena", 25);
		
		s2.displayInfo();
		
	    System.out.println("------------------");	
		Student s3 = new Student();	
		s3.setData(104, "Abhinav", 24);
		
		s3.displayInfo();
		
	}

}
