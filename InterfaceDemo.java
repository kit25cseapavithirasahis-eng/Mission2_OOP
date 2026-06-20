import java.util.Scanner;
interface Vehicle{
    void start();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car is starting...");
    }
}
class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike is starting...");
    }
}
public class InterfaceDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. car");
        System.out.println("2. Bike");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        Vehicle  v;
        if( choice == 1){
            v = new Car();
        } else {
            v= new Bike();
        }
        v.start();
        sc.close();
    }
}
