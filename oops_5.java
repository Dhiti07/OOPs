import java.util.*;
class Student{
    String sname;
    int [] marks_array;
    int total; 
    double avg;
    public void assign(String n, int [] m){
        sname = n;
        marks_array = m;
    }
    public void display(){
        System.out.println("name of the student is: "+sname);
        System.out.println("marks of the student are: ");
        for(int i=0;i<marks_array.length;i++){
            System.out.println("subject"+(i+1)+ " "+ marks_array[i]);
        }
        System.out.println("Total marks: "+ total);
        System.out.println("Average marks: "+avg);
    }
    public void compute(){
        total=0;
        for(int mark: marks_array){
            total=total+mark;
        }
        avg = total/marks_array.length;
    }
}
class StudentDemo{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        int n;
        System.out.println("enter the student name: ");
        String name = sc.next();
        System.out.println("enter the no. of elements: ");
        n=sc.nextInt();
        int marks[] = new int[n];
        for(int i =0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(marks[i]);
        }
        student.assign(name,marks);
        student.compute();
        student.display();
    }
}
