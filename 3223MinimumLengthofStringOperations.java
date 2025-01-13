class Solution {
    public int minimumLength(String s) {
        if(s.length()<=2){
            return s.length();
        }
        //find minimum length such that there should be atleast one character to left 
        //one character should be on right


        int freqcount[]=new int[26];
        //1.count frequency of each character in the string
        for(char ch:s.toCharArray()){
            freqcount[ch-'a']++;
        }

        int totalLength=0;
        
        
        // Step 2: Calculate the total length after deletions count
        for(int frequency:freqcount){
            if(frequency==0)continue;//skip characters that don't appear

            if(frequency%2==0){
                totalLength+=2;
            }
            else{
                totalLength+=1;
            }
        }
        return totalLength;
    }
}