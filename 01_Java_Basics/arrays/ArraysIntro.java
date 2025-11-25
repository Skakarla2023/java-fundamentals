package javaprograms;

import java.util.*;

public class ArraysIntro {

	public static void main(String[] args) {
		
		// Declaration of Arrays
		// 1.Dynamic declaration
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of array:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.print("Enter the Elements of the array:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("The Array is:"+Arrays.toString(arr));
		
		
		
		// 2. Static Declaration
		
		int[] arr1 = {6, 7, 8, 9, 10};
		
		System.out.print("The new array is:"+Arrays.toString(arr1));
		
		
		
		// 3.Find Minimum and Maximum element
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i:arr) {
			
			if(i>max) {
				max = i;
			}
			
			if(i<min) {
				min = i;
			}
		}
		
		System.out.println("Maximum element in the array:"+max);
		System.out.println("Minimum element in the array:"+min);
		
	}

}
