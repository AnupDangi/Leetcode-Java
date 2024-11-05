public class FindtheindexofFirstOccurenceInaString {
    class Solution {
        public int strStr(String haystack, String needle) {
            //Approach is to check the substring value from i to needle.length while iterating over the       haystack string 
            int m = haystack.length(), n = needle.length();
            for (int i = 0; i <= m - n; i++) {
                if (haystack.substring(i, i + n).equals(needle)) {
                    return i;
                }
            }
            return -1;
        }
    }
}
