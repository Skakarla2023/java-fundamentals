package javaprograms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] nums = { 9, 2, 6, 1, 8, 4 };
		int n = nums.length;
		System.out.println("Before sorting: " + Arrays.toString(nums));
		insertionSort(nums, n);
	}

	static void insertionSort(int[] nums, int n) {
		for (int i = 1; i < n; i++) {
			int key = nums[i];
			int j = i - 1;
			while (j >= 0 && nums[j] > key) {
				nums[j + 1] = nums[j];
				j--;
			}
			nums[j + 1] = key;
		}

		System.out.println("After Sorting: " + Arrays.toString(nums));
	}

}
