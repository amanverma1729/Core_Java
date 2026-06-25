package NotePadPrograms.Day4;

class Student
{
static int instituteCode;
String name;
int age;

public static void main(String[] args)
{
Student s1 = new Student(); 

Student.instituteCode = 10234;
s1.name = "Rahul";
s1.age = 20;


System.out.println("Institute Code\t:" + Student.instituteCode);
System.out.println("Name\t:" + s1.name);
System.out.println("Age\t:" + s1.age);





Student s2 = new Student(); // @102

Student s3 = new Student();// @103


Student s4 = s1;  // @101

Student s5 = s3; // @103

System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);


}

}