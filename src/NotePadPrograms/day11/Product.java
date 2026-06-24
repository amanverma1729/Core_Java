package NotePadPrograms.day11;

import java.util.Scanner;

public class Product {
	int id;
	String brandName;
	double price;

	public static Product getObject() {
		Product p = new Product();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Id : ");
		p.id = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter brand Name : ");
		p.brandName = sc.nextLine();
		
		System.out.println("Enter price : ");
		p.price = sc.nextDouble();
		
		return p;

	}

	public static void main(String[] args) {
		
	Product	obj  = Product.getObject();
	
	System.out.println("---Details----");
	
	System.out.println("Brand Name\t: " + obj.brandName);

	}

}
