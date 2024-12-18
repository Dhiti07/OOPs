import java.util.*;
class Mythread implements Runnable{
    public void run(){
       try{
         for(int i=0;i<5;i++){
            System.out.println("child thread is running");
            Thread.sleep(2000);
         }
       }
       catch(InterruptedException i){
        System.out.println(i);
       }
    }
}
public class MainDemo{
    public static void main(String [] args) throws InterruptedException{
        Mythread r = new Mythread();
        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("main thread is running");
            Thread.sleep(2000);
        }
    }
}
