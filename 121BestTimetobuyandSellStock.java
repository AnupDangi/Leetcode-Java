class Solution {
    public int maxProfit(int[] prices) {
        //optimized problem in 0(n)
        int min=prices[0];
        int profit=0;

        //brute force
        // for(int i=0;i<prices.length-1;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         profit=Math.max(profit,prices[j]-prices[i]);
        //     }
        // }

        //optimized
        for(int i=1;i<prices.length;i++){
            //update min if another minimum is found
            if(prices[i]<min){
                min=prices[i];
            }
            //check if other max profit is found then update
            if(profit<prices[i]-min){
                profit=prices[i]-min;
            }
        }
        return profit;
    }
}