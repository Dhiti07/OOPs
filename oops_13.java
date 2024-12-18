import java.util.*;
class Thread_1 extends Thread{
    @Override
    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("ABCDEF");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException i){
            System.out.println(i);
        }
    } 
}
class MainThread{
    public static void main(String[] args)throws InterruptedException{
        Thread_1 t1 = new Thread_1();
        t1.start();
        t1.interrupt();
        t1.join();
        System.out.println(t1.isAlive());
    }
}
