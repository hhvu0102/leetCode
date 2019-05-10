// The count-and-say sequence is the sequence of integers with the first five terms as following:

// 1.     1
// 2.     11
// 3.     21
// 4.     1211
// 5.     111221
// 1 is read off as "one 1" or 11.
// 11 is read off as "two 1s" or 21.
// 21 is read off as "one 2, then one 1" or 1211.

// Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.

// Note: Each term of the sequence of integers will be represented as a string.


class Solution {
    	    public String countAndSay(int n) {
	        if (n == 1)
	        {
	            return "1";
	        }
	        else if (n == 2)
	        {
	        	return "11";
	        }
	        else
	        {
	            String[] temp = new String[n];
	            temp[0] = "1";
	            temp[1] = "11";
	            temp[2] = "21";
	            for (int i = 3; i < n; i++)
	            {
	                String s = String.valueOf(temp[i-1]);
	                char[] c = s.toCharArray();
	                int count = 1;
	                ArrayList<Integer> read = new ArrayList<>();
	                for (int j = 0; j < c.length - 1; j++)
	                {
	                    if (c[j] == c[j+1])
	                    {
	                        count += 1;
	                    }
	                    else
	                    {
	                        read.add(count);
	                        read.add(Character.getNumericValue(c[j]));
	                        count = 1;
	                    }
	                    if (c[j] != c[j+1] && j + 1 == c.length - 1)
	                    {
	                    	read.add(1);
	                        read.add(Character.getNumericValue(c[j+1]));
	                    }
	                    else if (c[j] == c[j+1] && j + 1 == c.length - 1)
	                    {
	                    	read.add(count);
	                        read.add(Character.getNumericValue(c[j+1]));
	                    }
	                }
	                
	                String r = "";
	                for (int k = 0; k < read.size(); k++)
	                {
	                    r += read.get(k);
	                }
	                
	                temp[i] = r;
	                 
	            }
	            return temp[n-1];
	        }
	    }
}
