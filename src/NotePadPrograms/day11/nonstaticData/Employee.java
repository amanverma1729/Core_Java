package NotePadPrograms.day11.nonstaticData;
// this ia a keyword which holds address of object under execution
public class Employee {
	int age;
	public void task(Employee emp) {
	
		System.out.println(this.age);
		
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();  // @x
		e1.age = 24;
		Employee e2 = new Employee();  // @y
		e2.age = 45;
		
		e1.task(e2);   //  
		
		e2.task(e1);  
	}
}
