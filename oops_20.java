import java.util.*;
 class Matrix extends Thread{
    int row_sum;
    int col_sum;
    int diagonal_sum;
    int sum_secondary;
    int A[][];
    Matrix(int A[][]){
        this.A = A;
    }
    public void uniquenessofmatrix(){
        for(int i=0;i<A.length-1;i++){
            for(int j=0;j<A.length-1;j++){
                if(A[i][j] == A[i+1][j+1])
                   break;
            }
        }
        System.out.println("Not an unique");
    }
    /*public int rowsum(){
        row_sum = 0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
               col_sum = col_sum +A[][j];
            }
        }
    }
    public int col_sum(){
        col_sum = 0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){

            }
        }
    }*/
    public int diagonal(){
        diagonal_sum = 0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(i==j)
                  diagonal_sum = diagonal_sum +A[i][j];
            }
        }
        System.out.println("sum of all the diagonal elements of a matrix: "+diagonal_sum);
        return diagonal_sum;
    }
    public int second_diagonal(){
        sum_secondary = 0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(A.length-i-1==A.length-j-1)
                  sum_secondary = sum_secondary+A[i][j];
            }
        }
        System.out.println("sum of secondary diagonal is: "+sum_secondary);
        return sum_secondary;
    }
}
@Override
public void run(){
    uniquenessofmatrix();
    diagonal();
    second_diagonal(); 
}
public class MatrixDemo{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int n = sc.nextInt();
        int A[][] = new int[n][n];
        System.out.println("enter the elments of the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){
            Matrix m = new Matrix(A);
            m.start();
        }
    }
}

