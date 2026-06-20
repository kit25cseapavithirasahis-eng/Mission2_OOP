import java.util.Scanner;
class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
public class PolymorphismDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        Animal a;
        if (choice == 1){
            a = new Dog();
        } else {
            a = new Cat();
        }
        a.sound();
        sc.close();
    }
}
