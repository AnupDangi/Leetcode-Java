class Solution {
    public boolean canConstruct(String s, int k) {
        //length of string is less than k
        if(s.length()<k){
            return false;
        }
        //no of characters that have odd count is k then false
        //use an frequency count for character then store
        int n=s.length();
        int freq[]=new int[26]; //count characters frequency
        for(int i=0;i<n;i++){
            int chcount=s.charAt(i)-'a';
            freq[chcount]++;
        }
        //if any character eg 'a' has odd count ie 1,3,5---- which is greater than k then return false
        int countoddfreq=0;
        for(int i=0;i<26;i++){
            if(freq[i]%2!=0){
                countoddfreq++;
            }
        }
        if(countoddfreq>k){
            return false;
        }

        return true;

    }
}