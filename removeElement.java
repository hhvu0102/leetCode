// Given an array nums and a value val, remove all instances of that value in-place and return the new length.

// Super dumb and long solution, and nums = new int[0] is not an in-place remove.

class Solution {
    public int removeElement(int[] nums, int val) {
    if (nums.length == 0) {
        return nums.length;
    }
    else if (nums.length == 1 && val == nums[0]) {
        nums = new int[0];
        return nums.length;
    }
    else if (nums.length == 1 && val != nums[0]) {
        return 1;
    }
    else {
    ArrayList<Integer> index = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != val) {
            index.add(i);
        }
    }
    
    int j = 0;
    if (index.size() == 0) {
    	nums = new int[0];
        return nums.length;
    }
    else if (index.size() == 1) {
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == val) {
                nums[k] = nums[index.get(0)];
                j = 1;
                break;
            }
        }
    }
    else {
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != val && j < index.size()) {
                nums[k] = nums[index.get(j)];
                j++;
            }
            if (nums[k] == val && j < index.size()) {
                nums[k] = nums[index.get(j)];
                j++;
            }
        }
    }

    return j;
    }
    }
}

// Their solution
public int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
            nums[i] = nums[j];
            i++;
        }
    }
    return i;
}
