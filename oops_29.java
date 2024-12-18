import java.util.*;
class Student{
    private String name;
    private int rollno;
    private int marks[];
    public void display(){
        System.out.println("enter the name"+ name);
        System.out.println("enter the roll no."+ rollno );
        System.out.println("the marks are");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i] );
        }
    }
    Student(){
        String name;
        int rollno;
        int marks[];
    }
    Student(String name, int rollno, int marks[] ){
        this.name = name;
        this.rollno = rollno;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = marks[i];
        }
    }
    public static int avg(int marks[]){
        int sum = 0;
        for(int i=0;i<marks.length;i++){
            sum =+marks[i];
        }
        int average;
        return average = (sum)/(marks.length);
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the no. of students:");
      int n = sc.nextInt();
      it avg;
      int marks[] = new int[5];
      Student s[] = new Student[n];
      for(int i=0;i<n;i++){
        System.out.println("enter the name of the student: ");
         String name = sc.next();
        System.out.println("enter the roll no. of the student: ");
        int rollno = sc.nextInt();
        System.out.println("enter the marks of 5 subjects");
        for(int j;j<5;j++){
            marks[j] = sc.nextInt();
        }
        s[i] = new Student(name,rollno,marks);
      } 
      for(Student stu: s){
        stu.display();
      }
      System.out.println("the average of marks are: "+avg(marks));
    }
}
