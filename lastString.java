// Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

// If the last word does not exist, return 0.

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int last = s.lastIndexOf(' ');
        String l = s.substring(last+1, s.length());
        return l.length();
    }
}
