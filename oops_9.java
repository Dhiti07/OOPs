import java.util.*;
class Noinfo{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int arr [] = new int[n];
     int min = 999999;
     int max = -99999;
     int sum = 0;
     String choice;
     int n;
     System.out.println("enter the no. of elements you wish to enter");
     n = sc.nextInt();
     do{
        System.out.println("enter the no.");
        for(int i =0;i<n;i++){
         arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(max<arr[i]){
              max = arr[i];
            }
          }
          System.out.println("the max element in the array is: "+max);
          for(int i=0;i<n;i++){
            if(min>arr[i]){
              min = arr[i];
            }
         }
         for(int i =0;i<n;i++){
             sum = sum+arr[i];
         }
         System.out.println("the min element in the array is: "+ min);
         System.out.println("the sum of all the elements of the array: "+ sum);
         float avg = (float)(sum)/n;
         System.out.println("the avg of all the elements in the array"+ avg);
         System.out.println("Do you want to repeat all this again");
         choice = sc.next();
     }
     while(choice.equals("yes"));
   }
}
