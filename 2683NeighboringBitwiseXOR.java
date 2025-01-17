
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        //very easy 
        //we know the property if we take xor of each element and if it gives 0 then it should have been derived
        int ans=0;
        for(int num:derived){
            ans^=num;
        }
        return ans==0;
    }
}