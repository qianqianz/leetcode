public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int result=0, min = prices[0];
        for(int i = 0; i < prices.length-1; i++) {
            min = min < prices[i]?min:prices[i];
            result = result >(prices[i+1]-min)?result:(prices[i+1]-min);
        }
        return result;
    }
}