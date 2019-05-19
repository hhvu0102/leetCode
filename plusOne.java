// Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

// The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

// You may assume the integer does not contain any leading zero, except the number 0 itself.

class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        int count = digits.length - 1;
        while (count > 0 && digits[count] == 10)
        {
            digits[count] = 0;
            digits[count - 1] = digits[count - 1] + 1;
            count --;
        }
        if (digits[0] == 10)
        {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }
}
