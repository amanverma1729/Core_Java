package NotePadPrograms.Day12;

public class MethodOverloading {
    public static void add(int s,int r){
        System.out.println("Sum is: "+(s+r));
    }
    public static void main(String[] args) {
        MethodOverloading a = new MethodOverloading();
        add(5,6);
    }
    
}
