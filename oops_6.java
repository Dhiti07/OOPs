import java.util.*;
class Stack {
    int [] StackArray;
    int tos;
    public void stack(int size){
        StackArray = new int[size];
        tos=-1;
    }
    public void push(int element){
        if(tos == StackArray.length-1){
           System.out.println("Stack overflown");
        }
        else{
            tos++;
            StackArray[tos] = element;
            System.out.println(element+"pushed into the stack");
        }
    } 
    public void pop(){
        if(tos==-1){
            System.out.println("Stack underflown");
        }
        else{
            System.out.println("popped element from the stack is: "+ StackArray[tos]);
            tos--;
        }
    }
    public void display(){
        if(tos==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack contents: ");
            for(int i=0;i<=tos;i++){
                System.out.println(StackArray[i]+" ");
            }
            System.out.println();
        }
    }
}
public class StackDemo{
    public static void main(String [] args){
        Stack stack = new stack();
        stack.stack(6);
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.display();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
    }
}
