// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array size:");
        int m = sc.nextInt();
        
        int[] arr1 = new int[m];
        for(int i=0;i<m;i++){
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Enter second array size:");
        int n = sc.nextInt();
        
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }
        
        int[] arr = new int[m+n];
        
        for(int i=0;i<m;i++){
            arr[i] = arr1[i];
        }
        
        for(int i=0;i<n;i++){
            arr[m+i] = arr2[i];
        }
        
        Arrays.sort(arr);
        
        int a = arr.length;
        double median;
        if(a%2==0){
            median = (arr[a/2]+arr[(a/2)-1])/2.0;
        }
        else{
            median = arr[a/2];
        }
        
        System.out.printf("%.5f",median);
        
        
    }
}
