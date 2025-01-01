class Solution {
    //one pass 0(N)
    // public int maxScore(String s) {
    //     int best=Integer.MIN_VALUE;
    //     int ones=0;
    //     int zeros=0;

    //     for(int i=0;i<s.length()-1;i++){
    //         if(s.charAt(i)=='1'){
    //             ones++;
    //         }
    //         else{
    //             zeros++;
    //         }
    //         best=Math.max(best,zeros-ones);
    //     }
    //     if(s.charAt(s.length()-1)=='1'){
    //         ones++;
    //     }

    //     return best+ones;
    // }
    // public int maxScore(String s) {
    //     //brute force  Worst time complexity 0(2(N-1)*(N)) == O(N^2)
    //     //count 0's on left and count 1's on right
         
    //     int ans=0;
    //     for(int i=0;i<s.length()-1;i++){
    //         //loop to count 0 in increasing order of i
    //         int zeros=0;
    //         for(int j=0;j<=i;j++){
    //             if(s.charAt(j)=='0'){
    //                 zeros++;
    //             }
    //         }
    //         //loop to count 1 from i+1 to length of string 
    //         int ones=0;
    //         for(int k=i+1;k<s.length();k++){
    //             if(s.charAt(k)=='1'){
    //                 ones++;
    //             }
    //         }
    //         ans=Math.max(ans,zeros+ones);
    //     }
    //     return ans;
    // }
    
    public int maxScore(String s){
        //optimized 
        //first count ones in first iteration then if one encounters then decrement and count 0 
        int ones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
        }
        int zeros=0;
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='1'){
                ones--;
            }
            else{
                zeros++;
            }
            ans=Math.max(ans,zeros+ones);
        }
      return ans;
    }
}