// Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

// Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

// LeetCode solution
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
        {
            return 0;
        }
        
        int i = 0;
        for (int j = 1; j < nums.length; j++)
        {
            if (nums[j] != nums[i])
            {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}

// If I don't have to modify in-place
class Solution {
	public static int[] removeDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        
		if (nums.length == 0)
        {
            result.add(0);
        }
        
		result.add(nums[0]);
        for (int i = 1; i < nums.length; i++)
        {
        	if (nums[i] != nums[i-1])
        	{
        		result.add(nums[i]);
        	}
        }
        
        int[] arr = new int[result.size()];
        for (int j = 0; j < result.size(); j++)
        {
        	arr[j] = result.get(j);
        }
        
        return arr;
    }
}
