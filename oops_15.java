import java.util.*;
class Bank extends Thread{
    static int bal = 5000;
    static int withdraw;
    Bank(int withdraw){
        this.withdraw = withdraw;
    }
    public static synchronized void Withdraw(){
        String name = Thread.currentThread().getName();
        if(withdraw<=bal){
            System.out.println(name + " withdrawn money");
            bal = bal-withdraw;
        }
        else{
            System.out.println("Insuficient balance");
        }
    }
    public void run(){
        Withdraw();
    }
}
class customer{
    public static void main(String [] args){
        Bank obj = new Bank(5000);
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setName("X");
        t2.setName("Y");

        Bank obj2 = new Bank(5000);
        
        Thread t3 = new Thread(obj2);
        Thread t4 = new Thread(obj2);
        
        t3.setName("A");
        t4.setName("B");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
