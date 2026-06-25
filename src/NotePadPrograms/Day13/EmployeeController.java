package NotePadPrograms.Day13;
import java.util.Scanner;
public class EmployeeController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp =new Employee();
        // System.out.println("Enter the name:");
        // String name = sc.nextLine();
        // emp.setName(name);
        emp.setName("aman");
        emp.setId(20);
        emp.setSalary(5000.00);
        emp.setEmail("aman54@gamil.com");
        emp.setPhone(50588445L);
        System.out.println("----------------Employee Details -----------------");
        System.out.println("Name:"+emp.getName());
        System.out.println("Id:"+emp.getId());
        System.out.println("Salary:"+emp.getSalary());
        System.out.println("Email:"+emp.getEmail());
        System.out.println("Phone :"+emp.getPhone());
        
    }
    
}
