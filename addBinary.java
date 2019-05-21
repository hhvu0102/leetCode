// Given two binary strings, return their sum (also a binary string).

// The input strings are both non-empty and contains only characters 1 or 0.

// This solution does not work for case a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
// and b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"

class Solution {
    public int bin2dec(String x) {
        char[] digits = x.toCharArray();
        int value = 0;
        for (int i = 0; i < x.length(); i++)
        {
            value += Character.getNumericValue(digits[i])*Math.pow(2, x.length() - i - 1);
        }
        return value;
    }
    
    public String dec2bin(String y) {
        if (Integer.parseInt(y) <= 1)
        {
            return y;
        }
        else
        {
            return dec2bin(Integer.toString(Integer.parseInt(y)/2)) + Integer.toString(Integer.parseInt(y) % 2);
        }
    }
    
    public String addBinary(String a, String b) {
        int a1 = bin2dec(a);
        int b1 = bin2dec(b);
        return dec2bin(Integer.toString(a1 + b1));   

    }
}

// Neat solution from StackOverflow

public static String addBinary(){
 // The two input Strings, containing the binary representation of the two values:
    String input0 = "1010";
    String input1 = "10";

    // Use as radix 2 because it's binary    
    int number0 = Integer.parseInt(input0, 2);
    int number1 = Integer.parseInt(input1, 2);

    int sum = number0 + number1;
    return Integer.toBinaryString(sum); //returns the answer as a binary value;
}
