package javaprograms;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] nums = { 9, 2, 1, 6, 4, 8 };
		System.out.println("Before sorting:" + Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			int min = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[min]) {
					min = j;
				}
			}
			int temp = nums[min];
			nums[min] = nums[i];
			nums[i] = temp;
		}

		System.out.println("After sorting:" + Arrays.toString(nums));
	}
}
