class Solution {
    public static int lengthOfLastWord(String s) {
        int len=s.length()-1;
        int count=0;
        //the length may contains  only whitespaces also so decrement the length for that also
         while(len>=0 && s.charAt(len)==' '){
            len--;
         }
        
        while(len>=0 && s.charAt(len)!=' '){
            len--;
            count++;
        }
        return count;
    }
}