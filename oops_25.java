import java.util.*;
class duplicate{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] result = new int[n];
        int m = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < m; j++) {
                if (arr[i] == result[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[m++] = arr[i];
            }
        }
        System.out.println("the new array is: ");
        for(int i=0;i<m;i++){
            System.out.println(result[i]);
        }
    }
}
