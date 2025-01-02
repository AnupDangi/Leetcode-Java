class Solution {
    public int searchInsert(int[] nums, int target) {
      int low = 0;
      int high = nums.length - 1;
  
      while (low <= high) {
          int mid = low + (high - low) / 2;
  
          // If target is found
          if (nums[mid] == target) {
              return mid;
          }
  
          // If target is smaller, adjust the high boundary
          if (nums[mid] > target) {
              high = mid - 1;
          } 
          // If target is larger, adjust the low boundary
          else {
              low = mid + 1;
          }
      }
  
      // Return the position where target would be inserted
      return low;
  }
  }