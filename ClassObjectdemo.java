import java.util.Scanner;
class student{
    String name;
    int age;
}

public class ClassObjectdemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        System.out.println("Enter name:");
        s1.name = sc.nextLine();
        System.out.println("Enter age:");
        s1.age = sc.nextInt();
        System.out.println("Student Details:");
        System.out.println("Name: "+s1.name);
        System.out.println("Age: "+s1.age);
        sc.close();
    }
}
