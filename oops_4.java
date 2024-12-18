import java.util.*;
class Triangle{
    public static void Print(){
        int arr[][] = new int[10][10];  
    for(int i=0;i<10;i++){
        for(int j=0;j<=i;j++){
            arr[i][j] = i+j;
        }
    }
    for(int i=0;i<10;i++){
        for(int j=0;j<=i;j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    }
}
class TriangleDemo{
public static void main(String[] args){
Triangle l = new Triangle();
l.Print();
}
}
