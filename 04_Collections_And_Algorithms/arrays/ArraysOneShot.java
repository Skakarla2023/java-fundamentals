import java.util.*;

public class ArraysOneShot {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Array Declaration
        int[] arr;
        
        
        // Memory Allocation
        int[] arr1 = new int[5];
        
        
        // Declaration and Initialization
        int[] arr2 = {1, 2, 3, 4, 5};
        
        
        // Accessing array Elements
        System.out.println(arr2[1]);
        
        
        // Modifying array elements
        arr2[0] = 9;
        
        for(int i=0;i<5;i++){
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Array Elements:");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        
        
        // SEARCHING ELEMENTS IN ARRAY - LINEAR SEARCH
        int key = 10;
        Boolean found = false;
        
        for(int i:arr1){
            if(i == key){
                found = true;
            }
        }
        
        if(found){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
        
        
        // FINDING MAX and MIN ELEMENT
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i:arr2){
            if(i<min){
                min = i;
            }
            if(i>max){
                max = i;
            }
        }
        
        System.out.println("Maximum Element:"+max);
        System.out.println("Minimum Element:"+min);
        
        
        // SUM OF ARRAY ELEMENTS
        int sum = 0;
        for(int i:arr2){
            sum+=i;
        }
        System.out.println("Sum of array elements:"+sum);
        
        
        // AVERAGE OF ARRAY ELEMENTS
        int avg = sum/(arr2.length);
        System.out.println("Average of array elements:"+avg);
        
        
        
        // COPYING ARRAY ELEMENTS
        int[] b = new int[arr2.length];
        for(int i=0;i<arr2.length;i++){
            b[i] = arr2[i];
        }
        
        // using Arrays.copyOf
        int[] c = Arrays.copyOf(arr1,arr1.length);
        
        
        // SORT ARRAYS
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        
        
        // SHIFTING ELEMENTS
        // Left Shift
        int[] array = {1,4,6,7,8,9};
        int first = array[0];
        for(int i=0;i<array.length-1;i++){
            array[i] = array[i+1];
        }
        first = array[array.length-1];
        System.out.println("Left shifted array:"+Arrays.toString(array));
        
        // Right Shift
        int last = arr[array.length-1];
        for(int i=array.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        System.out.println("Right Shifted array:"+Arrays.toString(array));
        
        
        // CHECK IF ARRAY IS SORTED
        bool sorted = true;
        for(int i=1;i<array.length;i++){
            if(arr[i]>arr[i-1]){
                sorted=false;
                break;
            }
        }
        
        System.out.println("Is array sorted:"+sorted);
        
        // FREQUENCY ARRAY
        int[] freq = new int[array.length];
        for(int x:array){
            freq[x]++;
        }
        
        // MULTIVALUE RETURN USING ARRAYS
        
        
        // SORTING ARRAY IN DESCENDING ORDER
        int[] nums = {1,6,3,7,9,2};
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[nums.length-i-1];
            arr[nums.length-i-1] = temp;
        }

        // Count occurences


        // Find index of a value


        // FIND SECOND LARGEST ELEMENT


        // FIND SECOND SMALLEST ELEMENT
        
        
        System.out.println("Arrays in reverse order:"+Arrays.toString(nums));
        
        
    }
}
