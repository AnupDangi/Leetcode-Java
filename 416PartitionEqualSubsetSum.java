class Solution {
    //recursion gives TLE (Time limit Exceed)
    // public boolean recursion(int nums[],int n,int target){
    //         //base case
    //         if(n==0){
    //             return false;
    //         }
    //         if(target==0){
    //             return true;
    //         }
    //         //two choices
    //         //yes and no
        
    //           boolean ans=recursion(nums, n-1, target); //no call
    //             if(target-nums[n-1]>=0){
    //                 ans=ans||recursion(nums, n-1, target-nums[n-1]);//yes call 
    //             }
    //         return ans;
    //     }

     public static boolean memo_partition(int nums[],int n,int target,int [][]dp){
            //base case
            if(n==0){  // for dp array-1 =>no answer ,0->false ,1 ->true
                dp[n][target]=0;
                return false;
            }
            if(target==0){
                dp[n][target]=1;
                return true;
            }
            if(dp[n][target]!=-1){
                return dp[n][target]==1?true:false;
                
            }
           
            boolean ans=memo_partition(nums, n-1, target, dp);//no calls
                if(target-nums[n-1]>=0){
                    ans=ans||memo_partition(nums, n-1, target-nums[n-1],dp);//yes call 
                }
                dp[n][target]=ans?1:0;
                return ans;
        }
        public static boolean canPartition(int nums[]){
            int sum=0;
            int n=nums.length;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
            }
            if(sum%2!=0){ //if sum is odd then it cannot be broken down into two equal subsets
                return false;
            }
            else{
                //find one of the subset whose sum is half of the sum ie sum/2 
                //now use dp or recursion
                int target=sum/2;
                int dp[][]=new int[n+1][target+1];
                for(int i=0;i<=n;i++){
                    Arrays.fill(dp[i],-1);//no answer
                }
                //return recursion(nums,n,target);
                return memo_partition(nums,n,target,dp);
        }
    }

    
}