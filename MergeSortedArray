class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        //two pointers approach from backward 

        while (i >= 0 && j >= 0) {
            //if left array elem is larger then add it 
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                //if right array elem is larget then add 
                nums1[k--] = nums2[j--];
            }
        }
        //add remaining element
        while (j >= 0) {        
            nums1[k--] = nums2[j--];
        }
    }

    //Approach 2 
    
    // for(int k=0,i=m,k<n;k++){
    //     nums1[i++]=nums2[k++];
    // }
    // Arrays.sort(nums1);
}
