class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        // Variables for the first transaction
        int effectiveBuy1 = Integer.MAX_VALUE; // Minimum price for the first buy
        int profit1 = 0; // Maximum profit from the first transaction

        // Variables for the second transaction
        int effectiveBuy2 = Integer.MAX_VALUE; // Minimum price considering the profit from the first
        int profit2 = 0; // Maximum profit from the second transaction

        for (int i = 0; i < n; i++) {
            // Update the first transaction
            effectiveBuy1 = Math.min(effectiveBuy1, prices[i]); // Lowest price for the first buy
            profit1 = Math.max(profit1, prices[i] - effectiveBuy1); // Max profit for the first transaction

            // Update the second transaction
            effectiveBuy2 = Math.min(effectiveBuy2, prices[i] - profit1); // Effective price for the second buy
            profit2 = Math.max(profit2, prices[i] - effectiveBuy2); // Max profit for the second transaction
        }

        return profit2; // Return the max profit after two transactions
    }
}
