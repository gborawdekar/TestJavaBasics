package programs;

import java.util.Arrays;

public class IntermediateArray {

	/*
	 * Problem: Rotate an array of n elements to the right by k steps. For example,
	 * with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]
	 */

	public static void main(String a[]) {
		int k = 3;
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		if (k > nums.length)
			k = k % nums.length;
		int[] result = new int[nums.length];
		for (int i = 0; i < k; i++) {
			result[i] = nums[nums.length - k + i];
		}
		int j = 0;
		for (int i = k; i < nums.length; i++) {
			result[i] = nums[j];
			j++;
		}
		System.out.println(Arrays.toString(result));
	}

}
