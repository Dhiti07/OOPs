import java.util.*;
class Threading extends Thread{
    @Override
    public void run(){
        String n = Thread.currentThread().getName();
        int x = Thread.currentThread().getPriority();
        for(int i=0;i<3;i++){
            System.out.println(n);
        }
    }
}
class CLassDemo{
    public static void main(String [] args)throws InterruptedException{
      Threading t1 = new Threading();
      Threading t2 = new Threading();
      Threading t3 = new Threading();

      t1.setName("thread 1");
      t2.setName("thread 2");
      t3.setName("thread 3");

      t1.setPriority(4);
      t2.setPriority(2);
      t3.setPriority(7);
      t1.start();
      /*t1.join();
      System.out.println(t2.isAlive());*/
      t2.start();
      t3.start();
    }
}
