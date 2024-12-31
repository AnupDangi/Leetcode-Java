class Solution {

    public static int lpsmemo(String s,int i,int j,int dp[][]){
        //base case
        if(i>j){
            return 0;
        }
        if(i==j){
            return 1;
        }
        if(dp[i][j]!=-1){//if already fill
            return dp[i][j];
        }
        //same character at i and j index
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j]=lpsmemo(s, i+1, j-1, dp)+2;
        }
        //if no match then take maximum of i+1 and j-1 index making choices
        else{
            dp[i][j]=Math.max(lpsmemo(s, i+1, j, dp),lpsmemo(s, i, j-1, dp));
        }
        return dp[i][j];
    }
    public static int lps_dp(String str,int i,int j){
        int n=str.length();
        int dp[][]=new int[n][n];
        for(int diag=0;diag<n;diag++){
            for(i=0,j=diag;j<n;i++,j++){  
            if(i==j){
                dp[i][j]=1;
                continue;
            }
            int ans=0;
            if(str.charAt(i)==str.charAt(j)){
                ans=dp[i+1][j-1]+2; 
            }
            else{
                ans=Math.max(dp[i][j-1], dp[i+1][j]);
            }
            dp[i][j]=ans;
        }
     }
        return dp[0][n-1];
    }
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return lpsmemo(s,0,n-1,dp);
    }
}