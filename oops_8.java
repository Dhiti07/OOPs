import java.util.*;
class Student{
    String name;
    int age;
    int rollno;
    Student(){
        String name;
        int age;
        int rollno;
    }
    Student(String name, int age, int rollno){
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
    public void display(){
    System.out.println("The name of the student is: " + name);
    System.out.println("The age of the student is: "+age);
    System.out.println("The roll no. of the student is: "+rollno);
    }
}
class StudentDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student student_1 = new Student();
        System.out.println("Student details are: ");
        student_1.display();
        System.out.println();
        System.out.println("Enter the name of the student: ");
        String name = sc.next();
        System.out.println("Enter the age of the student: ");
        int age = sc.nextInt();
        System.out.println("Enter the roll no. of the student: ");
        int rollno = sc.nextInt();
        Student student_2 = new Student(name, age, rollno);
        System.out.println("STudent details are: ");
        student_2.display();
        }
    }
