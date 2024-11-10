import java.util.HashMap;

/** 
Given an array of integers nums and an integer target, return indices of the two 
numbers such that they add up to target.
You may assume that each input would have exactly
one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

class TwoSum {
    //Approach 1
    // public static int[] twoSum(int[] nums, int target) {
    //     int[] indices = new int[2]; // array for indices of two numbers
    //     for (int i = 0; i < nums.length - 1; i++) { 
    //         for (int j = i + 1; j < nums.length; j++) { // <n-1 
    //             if (nums[i] + nums[j] == target) {
    //                 indices[0] = i;//index first ie of i
    //                 indices[1] = j; //index second ie of j
    //                 return indices;
    //             }
    //         }
    //     }
    //     return indices;
    // }

    //Approach 2 Using HashMap
    public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> map=new HashMap<>();
            //add all element in map
            for(int i=0;i<nums.length;i++){
                map.put(nums[i],i);
            }
            for(int i=0;i<nums.length;i++){
                int diff=target-nums[i];
                if(map.containsKey(diff) && i!=map.get(diff)){
                    return new int[]{i,map.get(diff)};
                }
            }
            return null;
    }
}