//linear search
import java.util.*;
class linear{
  public static int LinearSearch(int arr[],int n,int key){
    for(int i=0;i<n;i++){
        if(arr[i]==key){
        System.out.println("your key is found at " + (i+1));
        return 1;
        }
    }
    System.out.println("your key is not found");
    return 0;
  }    
}
class LinearDemo{
    public static void main(String[] args){
        int n,key;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of elements");
        n = sc.nextInt();
        System.out.println("Enter the key which is to be searched");
        key = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the no. of elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        linear l = new linear();
        l.LinearSearch(arr,n,key);
    }
}