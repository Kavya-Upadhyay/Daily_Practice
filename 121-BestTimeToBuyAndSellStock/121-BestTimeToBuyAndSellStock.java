// Last updated: 7/31/2025, 12:21:28 PM
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            profit=Math.max(profit,prices[i]-buy);
        }
        return profit;
        
    }
}