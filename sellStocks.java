class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int prof = 0;
        for (int i = prices.length - 1; i >= 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                prof = prices[i] - prices[j];
                if (prof > max)
                {
                    max = prof;
                }
            }
        }
        return max;
    }
}
