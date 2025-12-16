# QuickSort

Quick Sort is a sorting algorithm that sorts an array by:

- picking one element as a pivot
- placing all smaller elements on the left
- placing all larger elements on the right
- then repeating the same process on the left and right parts

It follows the Divide and Conquer strategy.



## How Partition Works (Very Important)

Partition is the heart of Quick Sort.

#### Partition Logic (Easy Version)

- Choose pivot
- Keep an index i for smaller elements
- Traverse array using index j
- If arr[j] ≤ pivot:
  - increment i
  - swap arr[i] and arr[j]
- Finally, place pivot in correct position
- After partition:
  - pivot is correctly placed
  - everything left of pivot is smaller
  - everything right of pivot is larger
