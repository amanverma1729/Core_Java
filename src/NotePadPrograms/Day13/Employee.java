package NotePadPrograms.Day13;

public class Employee {
    private String name;
   private int id;
   private double salary;
   private String email;
    private long phoneNo;

    

public void setName(String name){
    this.name=name;

}
public void setId(int id ){
    this.id=id;

}
public void setSalary(double salary){
    this.salary=salary;
}
public void setEmail(String email){
    this.email=email;

}
public void setPhone(long phoneNo){
    this.phoneNo=phoneNo;
}

// getter
public String getName(){
    return this.name;
}
public int getId(){
    return this.id;
}
public double getSalary(){
    return this.salary;
}
public String getEmail(){
    return this.email;

}
public long getPhone(){
    return this.phoneNo;
}


}
