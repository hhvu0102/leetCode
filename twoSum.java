# Given an array of integers, return indices of the two numbers such that they add up to a specific target.

# You may assume that each input would have exactly one solution, and you may not use the same element twice.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] data = new int[2];
        boolean stop = false;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = nums.length - 1; j > i; j--)
            {
                if (nums[i] + nums[j] == target)
                {
                    data[0] = i;
                    data[1] = j;
                    stop = true;
                    return data;
                }
            }
        }
        if (stop == false)
        {
            data = new int[0];
        }
        
        return data;
    }
}
