//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

//Note: For the purpose of this problem, we define empty string as valid palindrome.

class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0)
        {
            return true;
        }
        int i = 0;
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] ch = s.toCharArray();
        while (i < ch.length/2)
        {
            if (Character.isLetterOrDigit(ch[i]) && ch[i] != ch[ch.length - i - 1])
            {
                return false;
            }
            else
            {
                i++;
            }
        }
        return true;
    }
}
