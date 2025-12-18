package javaprograms;

import java.util.*;

public class NextGreatestElement {
	public static void main(String[] args) {
		int[] nums = { 4, 5, 2, 10, 8 };
		int n = nums.length;
		int[] nge = new int[n];
		Stack<Integer> stack = new Stack<>();
		for (int i = n - 1; i >= 0; i--) {
			while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
				stack.pop();
			}
			nge[i] = stack.isEmpty() ? -1 : nums[stack.peek()];
			stack.push(i);
		}

		System.out.println(Arrays.toString(nge));

	}
}
