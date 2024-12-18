import java.util.*;
class Multiplication extends Thread {
    int number;
    Multiplication(int number){
        this.number = number;
    }
    @Override
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println(number + "*"+ i + "=" +(number*i));
            System.out.println();
        }
    }
}
public class Tables{
    public static void main(String[] args)throws InterruptedException{
        Multiplication table1 = new Multiplication(5);
        Multiplication table2 = new Multiplication(7);
        table1.start();
        table1.join();
        table2.start();
        table2.join();
    }
}
    
