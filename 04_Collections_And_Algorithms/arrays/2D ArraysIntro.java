import java.util.*;

public class TDArrays{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int m = sc.nextInt();
        System.out.println("Enter number of Columns:");
        int n = sc.nextInt();
        
        int[][] arr = new int[m][n];
        
        System.out.println("Enter Array element:");
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The Array is:"+Arrays.deepToString(arr));
        
        int sum =0;
        int sum2=0;
        for(int i=0;i<m;i++){
            sum+=arr[i][i];
            sum2+=arr[i][n-1-i];
        }
        
        System.out.println("Diagonal sum:"+sum);
        System.out.println("Reverse Diagonal sum:"+sum2);
    }
}
