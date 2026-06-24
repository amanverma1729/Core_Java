package NotePadPrograms.day11;

import java.util.Scanner;

public class CustomerController {
	
	
	
	public static void task1(Customer c1 , Customer c2)
	{	
		if(c1.age < c2.age)  
		{
			System.out.println(c1.name + " is youngest");
			System.out.println("---Details----");
			System.out.println("Name  : " + c1.name);
			System.out.println("Id    : " + c1.id);
			System.out.println("Age   : " + c1.age);
			
		}else if(c2.age <  c1.age){
			System.out.println(c2.name + " is youngest");
			System.out.println("---Details----");
			System.out.println("Name  : " + c2.name);
			System.out.println("Id    : " + c2.id);
			System.out.println("Age   : " + c2.age);
		}else {
			System.out.println(c1.name + " and " + c2.name + " have same age");
		}
	}
	
	public static Customer task2(Customer c1 , Customer c2)
	{
		if(c1.age < c2.age)
		{
			return c1;
		}else {
			return c2;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Customer cust1 = new Customer();
		System.out.println("Enter id : ");
		cust1.id = sc.nextInt();  // 
		System.out.println("Enter name : ");
		cust1.name = sc.next();
		System.out.println("Enter Age : ");
		cust1.age = sc.nextInt();
		
		Customer cust2 = new Customer();
		cust2.id = 102; 
		cust2.name = "Reema";
		cust2.age = 23;
		
		// task1 : 
		
		task1(cust1, cust2);
		
		
		// task 2 : 
		Customer  result =  task2(cust1 , cust2);
		
		System.out.println("---Details----");
		System.out.println("Name  : " + result.name);
		System.out.println("Id    : " + result.id);
		System.out.println("Age   : " + result.age);
		
		
	}

}
