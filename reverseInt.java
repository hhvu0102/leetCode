# Given a 32-bit signed integer, reverse digits of an integer.

# This solution can't really check if x is in the accepted range, because Java Compiler itself checks before we can supply an overflow number.

class Solution {
    public int reverse(long x) {
        if (x <= Integer.MIN_VALUE || x >= Integer.MAX_VALUE)
        {
            return 0;
        }
        else
        {
            String number = String.valueOf(x);
            char[] digits = number.toCharArray();
            String[] arr = new String[digits.length];
            for (int i = digits.length - 1; i >= 0; i--)
            {
                arr[digits.length - 1 - i] = String.valueOf(digits[i]);
            }
            
            String str = "";
            if (arr[digits.length - 1].equals("-"))
            {
                str = "-";
                for (int j = 0; j < digits.length - 1; j++)
                {
                    str = str + arr[j];
                }
            }
            else
            {
                for (int j = 0; j < digits.length; j++)
                {
                    str = str + arr[j];
                }
            }
            
            int result = 0;
            result = Integer.parseInt(str);
            if (result <= Integer.MIN_VALUE || result >= Integer.MAX_VALUE)
            {
                return 0;
            }
            return result;
        }
    }
}
