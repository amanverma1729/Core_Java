package NotePadPrograms.Day13;

public class empController {

    public static emp highestPaidEmp(emp e1, emp e2, emp e3){
        if(e1.getSalary()>e2.getSalary()&& e1.getSalary()>e3.getSalary()){
            return e1;
        }
        else if (e2.getSalary()>e1.getSalary()&& e2.getSalary()>e3.getSalary()){
            return e2;

        }
        else{
            return e3;
        }
    }
    public static void main(String[] args) {
        emp e1 = new emp();
        e1.setName("Raju");
        e1.setSalary(22000);

         emp e2 = new emp();
        e2.setName("Ram");
        e2.setSalary(15000);

         emp e3 = new emp();
        e3.setName("Jack");
        e3.setSalary(45000);

        emp hpe = highestPaidEmp(e1, e1, e3);
        System.out.println(hpe.getName()+" is the highest paid employee with the sal of "+hpe.getSalary());

    }
    
}
