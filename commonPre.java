// Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".

// LeetCode solution, smart:
 public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++)
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) return "";
        }        
    return prefix;
}

// My solution
class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
        {
            return "";
        }
        if (strs.length == 1)
        {
            return strs[0];
        }
        for (int n = 0; n < strs.length; n++)
        {
            if (strs[n].equals(""))
            {
                return "";
            }
        }
        
        String s0 = strs[0];
        char[] let_s0 = s0.toCharArray();
        
        String s1 = strs[1];
        char[] let_s1 = s1.toCharArray();
        
        ArrayList<Character> chars = new ArrayList<Character>();
        
        if (let_s0.length <= let_s1.length)
        {
            for (int i = 0; i < let_s0.length; i++)
            {
                if (let_s0[i] == let_s1[i])
                {
                    chars.add(let_s0[i]);
                }
                else
                {
                    break;
                }
            }
        }
        else
        {
            for (int i = 0; i < let_s1.length; i++)
            {
                if (let_s1[i] == let_s0[i])
                {
                    chars.add(let_s1[i]);
                }
                else
                {
                    break;
                }
            }
        }

        for (int j = 2; j < strs.length; j++)
        {
            char[] temp = strs[j].toCharArray();
            if (temp.length <= chars.size())
            {
                for (int k = 0; k < temp.length; k++)
                {
                    if (temp[k] != chars.get(k))
                    {
                        while (chars.size() > k)
                        {
                            chars.remove(chars.size() - 1);
                        }
                    }
                    else
                    {
                        while (chars.size() > temp.length)
                        {
                            chars.remove(chars.size() - 1);
                        }
                    }
                }
            }
            else
            {
                for (int k = 0; k < chars.size(); k++)
                {
                    if (temp[k] != chars.get(k))
                    {
                        while (chars.size() > k)
                        {
                            chars.remove(chars.size() - 1);
                        }
                    }
                    else
                    {
                        while (chars.size() > temp.length)
                        {
                            chars.remove(chars.size() - 1);
                        }
                    }
                }
            }
        }
                    
            String result = "";
            for (int m = 0; m < chars.size(); m++)
            {
                result += chars.get(m);
            }
            
            return result;
    }
}
