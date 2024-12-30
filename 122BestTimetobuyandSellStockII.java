class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        //using the concept  of effectivebuy ie
        //buy at first and sell so effectivebuyprice is minimum of previous value and new buyvalue it should be minimum 
        //so next time buy at 2nd time effectivebuy price is prices[i]-profit
        int profit=0;
        int effectivebuyPrice=prices[0];
        for(int i=0;i<n;i++){
            profit=Math.max(profit,prices[i]-effectivebuyPrice);
            effectivebuyPrice=Math.min(effectivebuyPrice,prices[i]-profit);
        }
        return profit;
    }
}