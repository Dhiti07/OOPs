//implementing threads, sleep and start method
import java.util.*;
class MyThread extends Thread{
    @Override
    public void run(){
        try{
           for(int i=0;i<5;i++){
               System.out.println("XYZ");
               Thread.sleep(2000);
            }
        }
        catch(InterruptedException i){
            System.out.println(i);
        }
    }
} 
class DemoClass{
    public static void main(String [] args)throws InterruptedException{
        MyThread t = new MyThread();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("ABC");
            Thread.sleep(3000);
        }
    }
}