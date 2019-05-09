// Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

// My solution
class Solution {
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        char[] digits = number.toCharArray();
        String[] arr = new String[digits.length];
        for (int i = digits.length - 1; i >= 0; i--)
        {
            arr[digits.length - 1 - i] = String.valueOf(digits[i]);
        }
            
        String str = "";
        for (int j = 0; j < digits.length; j++)
        {
            str = str + arr[j];
        }
        

        return str.equals(number);
        }
}
