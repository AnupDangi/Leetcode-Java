import java.util.HashMap.*;
public class RemoveDuplicatesfromSortedArray {
    class Solution {
        public int removeDuplicates(int[] nums) {
            
            HashSet<Integer>map=new HashSet<>();
            for(int i=0;i<nums.length;i++){
                map.add(nums[i]);
            }
            PriorityQueue<Integer>q=new PriorityQueue<>(map);
            int index=0;
            while(!q.isEmpty()){
                nums[index]=q.poll();
                index++;
            }
            return map.size();
    
        }
    }
}
