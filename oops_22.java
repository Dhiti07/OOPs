import java.util.*;
class student{
    String name;
    int id;
    student(String name, int id){
        this.name = name;
        this.id= id;
    }
    void display(){
        System.out.println("Student details are: ");
        System.out.println("Name" +name);
        System.out.println("Id "+id);
    }
}
class employee{
    String ename;
    int eid;
    employee(String ename,int eid){
        this.ename = ename;
        this.eid = eid;
    }
    public void display(){
        System.out.println("employee details");
        System.out.println("Name " +ename);
        System.out.println("Id" +eid);
    }
}
class stack<T>{
    int top =-1;
    static int max = 10;
    T s[];
    stack(T s[]){
        this.s =s;
    }
    boolean isfull(){
        return top == max-1;
    }
    boolean isempty(){
        return top ==-1;
    }
    void push(T ele){
        if(isfull()){
         System.out.println("Stack overflow");
         return ;
        }
        else{
            s[++top] = ele;
        }
    }
    T pop(){
        if(isempty()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return s[top--];
        }
    }
}
class StackDemo{
    public static void main(String [] args){
        
    }
}
