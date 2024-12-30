class Solution {
    public int recur(int idx,int []houses,int []dp){
        if(idx>=houses.length){
            return dp[idx]=0;
        }
        //return if already calcuated
        if(dp[idx]!=-1){
            return dp[idx];
        }
        
        int yes=recur(idx+2,houses,dp)+houses[idx];//move to +2 idx
        int no=recur(idx+1,houses,dp);//move to +1 idx

        return dp[idx]=Math.max(yes,no);
    }
    public int rob(int[] nums) {
        //Greedy fails
        //new to use dp at any cost to solve this question by making choices
        int n=nums.length;
        int dp[]=new int[n+5];
        Arrays.fill(dp,-1);
        int idx=0; //initial idx
       return recur(idx,nums,dp);
    }
}