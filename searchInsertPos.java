// Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// Sol:

class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1)
        {
            if (nums[0] > target)
            {
                return 0;
            }
            else if (nums[0] < target)
            {
                return 1;
            }
        }
        
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == target)
            {
                return i;
            }
        }
        for (int j = 1; j <= nums.length - 1; j++)
        {
            if (nums[0] > target)
            {
                return 0;
            }
            else if (nums[j-1] < target && nums[j] > target)
            {
                return j;
            }
            else if (nums[nums.length - 1] < target)
            {
                return nums.length;
            }
        }

        return -1;
        }
}
