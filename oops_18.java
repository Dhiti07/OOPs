import java.util.*;
class matrix implements Runnable{
    int A[];
    int row;
    int n;
    int sum;
    matrix(int A[],int row,int n){
        this.A = A;
        this.row = row;
        this.n = n;
    }
    @Override
    public void run(){
        sum = 0;
        for(int i=0;i<n;i++){
           sum = sum +A[i];     
        }
        System.out.println("the sum is: "+sum);
    }
    int getSum(){
        return sum;
    }
}
class MainDemo{
    public static void main(String [] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows and columns in the matrix: ");
        int n = sc.nextInt();
        int A[][] = new int[n][n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j] = sc.nextInt();
            }
        }
        int total_sum = 0;
        int sum_row;
        for(int i=0;i<n;i++){
            matrix m = new matrix(A[i],i,n);
            Thread t = new Thread(m);
            t.start();
            t.join();
            sum_row = m.getSum();
            total_sum = total_sum +sum_row;
        }
        System.out.println("the total sum is: " +total_sum);
    }
}
