class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length; // Get the length of the input arrays
        int[] res = new int[n]; // Result array to store prefix common counts
        int[] freq = new int[n + 1]; // Frequency array to track occurrences of each number (1 to n)
        int count = 0; // Counter to keep track of the total number of common elements in prefixes
        
        // Iterate through each index of the arrays
        for (int i = 0; i < n; i++) {
            // Increment frequency for the current element in A
            freq[A[i]]++;
            // If the frequency of A[i] becomes 2, it means A[i] is now common between A and B
            if (freq[A[i]] == 2) {
                count++; // Increment the count of common elements
            }

            // Increment frequency for the current element in B
            freq[B[i]]++;
            // If the frequency of B[i] becomes 2, it means B[i] is now common between A and B
            if (freq[B[i]] == 2) {
                count++; // Increment the count of common elements
            }

            // Store the current count of common elements in the result array
            res[i] = count;
        }
        
        return res; // Return the final result array
    }
}
