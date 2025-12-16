
package javaprograms;

import java.util.*;

public class QuickSort {

	public static int partition(int[] nums, int left, int right) {
		int pivot = nums[right];
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if (nums[j] < pivot) {
				i++;
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		i++;
		int temp = nums[i];
		nums[i] = pivot;
		nums[right] = temp;
		return i;
	}

	public static void quickSort(int[] nums, int left, int right) {
		if (left < right) {
			int idx = partition(nums, left, right);
			quickSort(nums, left, idx - 1);
			quickSort(nums, idx + 1, right);
		}
	}

	public static void main(String[] args) {
		int[] nums = { 6, 3, 9, 5, 2, 8 };
		int n = nums.length;
		System.out.println("Unsorted array: " + Arrays.toString(nums));

		quickSort(nums, 0, n - 1);
		System.out.println("Sorted arrays: " + Arrays.toString(nums));
	}
}
