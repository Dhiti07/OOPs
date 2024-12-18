//prime no.
import java.util.*;
class Prime {
    public static boolean isPrime(int x){
        for(int i=2;i<x;i++){
            if(x%i==0)
            return false;
        }
        return true;
    }
}
class PrimeDemo{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x");
        int x =sc.nextInt();
        Prime l = new Prime();
        boolean prime = l.isPrime(x); 
        if(prime==true){
            System.out.println("your no. is prime");
        }
        else{
            System.out.println("your no. is not prime");
        }
    }
}
