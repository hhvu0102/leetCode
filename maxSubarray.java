// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

public class Solution {
	public static int maxSubArray(int[] nums) {
		int max = nums[0];
		int h = 0;
		int count = 0;
		while (h < nums.length) {
			count += nums[h];
			if (count > max) {
				max = count;
			}
			if (count < 0) {
				count = 0;
			}
			h++;
		}

		return max;

	}
