class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int k=nums1.length+nums2.length;
        int []merge=new int[k];

        int idx=0;
        for(int i=0;i<nums1.length;i++){
           merge[idx++]=nums1[i];
        }

        for(int i=0;i<nums2.length;i++){
            merge[idx++]=nums2[i];
        }
        Arrays.sort(merge);

        int length=merge.length;
         //for odd no of element
        if(length %2!=0){
            return (double) merge[length/2];
        }
        //for even
        else{
            int middle=length/2;
            return ((double) merge[middle]+ (double) merge[middle-1])/2.0;
        }

    }
}
