class Solution {
    public int minimizeXor(int num1, int num2) {
        // Step 1: Calculate the number of set bits in num2
        int bitCount = Integer.bitCount(num2);

        // Step 2: Calculate the difference in set bits between num1 and bitCount
        // If bitCount is negative, num1 has more set bits than required; if positive, fewer.
        bitCount -= Integer.bitCount(num1);

        // Variable to track the current bit being considered
        int curr = 1;

        // Step 3: Adjust num1 to match the required number of set bits
        while (bitCount != 0) {
            if (bitCount < 0 && (num1 & curr) != 0) {
                // If num1 has extra set bits, unset a bit
                num1 ^= curr;
                bitCount++; // Increment towards zero
            } else if (bitCount > 0 && (num1 & curr) == 0) {
                // If num1 has fewer set bits, set a bit
                num1 |= curr;
                bitCount--; // Decrement towards zero
            }
            // Move to the next bit
            curr <<= 1;
        }

        // Step 4: Return the modified num1, which has the desired number of set bits
        return num1;
    }
}
