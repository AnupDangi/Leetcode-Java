class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xorNums1 = 0, xorNums2 = 0;

        // Calculate XOR of nums1 and nums2
        for (int num : nums1) {
            xorNums1 ^= num;
        }
        for (int num : nums2) {
            xorNums2 ^= num;
        }

        // Initialize the result
        int result = 0;

        // Contribution based on the parity of lengths
        if (nums2.length % 2 != 0) {
            result ^= xorNums1;
        }
        if (nums1.length % 2 != 0) {
            result ^= xorNums2;
        }

        return result;
    }
}

//brute force
// class Solution {
//     public int xorAllNums(int[] nums1, int[] nums2) {
//         // Step 1: Create an array to store XOR results
//         int[] result = new int[nums1.length * nums2.length];
//         int index = 0;

//         // Step 2: Calculate XOR of every pair (nums1[i], nums2[j])
//         for (int i = 0; i < nums1.length; i++) {
//             for (int j = 0; j < nums2.length; j++) {
//                 result[index++] = nums1[i] ^ nums2[j];
//             }
//         }

//         // Step 3: Calculate the final answer using the result array
//         int ans = 0;
//         for (int i = 0; i < result.length; i++) {
//             ans ^= result[i]; // XOR all the elements together
//         }

//         return ans;
//     }
// }
