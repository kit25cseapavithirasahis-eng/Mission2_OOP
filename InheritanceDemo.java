import java.util.Scanner;
class person{
    String name;
    void setName(String name){
        this.name = name;
    }
}
class Student extends person{
    int mark;
    void setMark(int mark){
        this.mark = mark;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Mark: "+ mark);
    }
}
public class InheritanceDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter Mark: ");
        int mark = sc.nextInt();
        s.setName(name);
        s.setMark(mark);
        s.display();
        sc.close();
    }
}
