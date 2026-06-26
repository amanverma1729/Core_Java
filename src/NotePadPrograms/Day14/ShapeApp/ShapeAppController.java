package NotePadPrograms.Day14.ShapeApp;

import java.util.Scanner;

public class ShapeAppController {
    
    public static void main(String[] args) {
        
         System.out.println("Select the input from the given option");
         System.out.println("Press 1 for Circle");
         System.out.println("Press 2 for Square");
         System.out.println("Press 3 for Reactangle");
         System.out.println("Press 4 to Exit from app");

        Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
        if (input ==1) {
            Circle c =new Circle(101, "cirlce", "red", 9);
            System.out.println("enter your choice:");
            System.out.println("Press a or A for area ");
            System.out.println("Press P or p of parameter");
            String choice =sc.next();
            if(choice.charAt(0)=='a' || choice.charAt(0)=='A'){
                double area=Math.PI*c.radius*c.radius;
                System.out.println("The area of the circle is :"+area);
            }
            if(choice.charAt(0)=='p' || choice.charAt(0)=='P'){
                System.out.println("The Parameter of the circle is :"+Math.PI*c.radius*c.radius);

            }
            
        }

        if(input==2){
            Square s =new Square(102, "Square","Blue",5);
            System.out.println("Square obj created sucessfully");
            System.out.println("enter your choice:");
            System.out.println("Press a or A for area ");
            System.out.println("Press P or p of parameter");
            String choice =sc.next();
            if(choice.charAt(0)=='a' || choice.charAt(0)=='A'){
                double area=s.length*s.length;
                System.out.println("The area of the Square is :"+area);
            }
            if(choice.charAt(0)=='p' || choice.charAt(0)=='P'){
                System.out.println("The Parameter of the s is :"+4*s.length);

            }
            
            
        }

        if(input==3){
            Rectangle r =new Rectangle(103, "Reactangle", "Green", 5, 10);

             System.out.println("Reactangle obj created sucessfully");
            System.out.println("enter your choice:");
            System.out.println("Press a or A for area ");
            System.out.println("Press P or p of parameter");
            String choice =sc.next();
            if(choice.charAt(0)=='a' || choice.charAt(0)=='A'){
                double area=r.length*r.bredth;
                System.out.println("The area of the Square is :"+area);
            }
            if(choice.charAt(0)=='p' || choice.charAt(0)=='P'){
                System.out.println("The Parameter of the s is :"+(2*(r.length*r.bredth)));

            }
            

        }
        
    }
}
