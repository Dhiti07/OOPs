//find sum of all digits in the array
import java.util.*;
class Sum {
 public static int FindSum(int x){
    int sum = 0;
    int last = 0;
    while(x!=0){
     last = x%10;
     sum=sum+last;
     x=x/10;       
    }
    return sum;
 }    
}
class SumDemo{
    public static void main(String [] args){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x");
        x = sc.nextInt();
        Sum l = new Sum();
        System.out.println("The sum of the digits of the "+l.FindSum(x));
    }
}
