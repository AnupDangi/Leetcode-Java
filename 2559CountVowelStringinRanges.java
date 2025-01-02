class Solution {
    private boolean isVowel(char c){
        return c=='a'|| c=='e'||c=='i'||c=='o'||c=='u';
        //returns true if any of these characters appear
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        //create a prefixsum of length n
        int []prefixSum=new int[n+1];
        //pre compute the prefix sum for count of string starting and ending vowels

        for(int i=0;i<n;i++){
            char start=words[i].charAt(0);
            char end=words[i].charAt(words[i].length()-1);
            //if is vowel start and end word 
            if(isVowel(start)&& isVowel(end)){
                prefixSum[i+1]=1+prefixSum[i];
            }
            //if not copy the previous 
            else{
                prefixSum[i+1]=prefixSum[i];
            }
        }

        //Compute each query
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; ++i) {
            int start = queries[i][0];
            int end = queries[i][1];
            result[i] = prefixSum[end + 1] - prefixSum[start];
        }

        return result;
    }
}