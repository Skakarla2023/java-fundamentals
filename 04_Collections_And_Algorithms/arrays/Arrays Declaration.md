# Arrays Declaration

- There are two ways to declare an array in java.
- They are:
  - Static declaration
  - Dynamic delcaration
 


## Static Declaration

- You decide the size of the array before the program runs.

- The size is fixed and cannot change later.


```java
int[] arr1 = {6, 7, 8, 9, 10};
System.out.print("The new array is:"+Arrays.toString(arr1));
```

## Dynamic Declaration

- The size of the array is decided while the program is running (runtime).

- You can ask the user for the size or calculate it in the program.

```java
Scanner sc = new Scanner(System.in);
System.out.println("Size of array:");
int n = sc.nextInt();
		
int[] arr = new int[n];
	
System.out.print("Enter the Elements of the array:");
for(int i=0;i<n;i++) {
	arr[i] = sc.nextInt();
}
		
System.out.print("The Array is:"+Arrays.toString(arr));
```

