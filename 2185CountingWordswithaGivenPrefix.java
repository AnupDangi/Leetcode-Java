class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=words.length;
        int count=0;
        for(int i=0;i<n;i++){
            String word=words[i];
            if(word.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}