// Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// Super short solution from Discussion Section on LeetCode.
// I couldn't solve this in Java. For Java, slack is required.

class Solution:
    def isValid(self, s: str) -> bool:
        while "()" in s or "{}" in s or '[]' in s:
            s = s.replace("()", "").replace('{}', "").replace('[]', "")
        return s == ''
