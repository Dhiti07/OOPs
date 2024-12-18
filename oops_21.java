import java.util.*;
class swap{
    public <T extends Number> void swapping(T A[],int x)throws Exception{
       for(int i=0;i<(x-1);i++){
        T temp = A[i];
        A[i] = A[i+1];
        A[i+1] = temp;
       }
    }
}
class swapDemo{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no. of elements");
       int n = sc.nextInt();
       Integer arr[] = new Integer[n]; 
       System.out.println("enter the elements of the array");
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
       }
       swap s = new swap();
       try{
       s.swapping(arr,n);
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
       System.out.println("the swapped array is: ");
       for(int i=0;i<n;i++){
        System.out.println(arr[i]);
       }
    }
}
