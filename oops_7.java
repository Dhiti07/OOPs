import java.util.*;
class ISBN {
    int code[]= new int[10];
    public static void inputISBN(){
        int code[]= new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the ISBN code for the book");
        if(code.length==10){
           for(int i=0;i<10;i++){
               code[i] = sc.nextInt();
            }
            checkISBN(code);
        }
        else{
            System.out.println("ISBN should be a 10 digit no.");
        }
    }
    public static void checkISBN(int [] code){
        int j=0;
        int sum=0;
        for(int i=1;i<11;i++){
            sum = sum + (i*code[j]);
            j++;
        }
        if(sum%11 ==0){
            System.out.println("Legal ISBN");
        }
        else{
            System.out.println("Illegal ISBN");
        }
    }   
}
class DemoISBN{
public static void main(String [] args){
ISBN l = new ISBN ();
l.inputISBN();
   }
}
