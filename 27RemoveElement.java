public class RemoveElement {
    class Solution {
        public int removeElement(int[] nums, int val) {
            //Approach is to the keep track of variable which acts as index
            //if current idx element is not equal to val then replace that at k then position and it keeps on   incrementing  
            int k=0;
            for(int i=0;i<nums.length;i++){
                 if(nums[i]!=val){
                    nums[k]=nums[i];
                    k++;
                 }
            }
            return k;
        }
    }
}
