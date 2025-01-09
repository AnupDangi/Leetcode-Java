class Solution {
    public int[] plusOne(int[] digits) {
        //approach traverse from back if less than 9 increment that number return 
        for(int i=digits.length-1;i>=0;i--){
        //if less than 9 increment and return 
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            //then it is 9 so make it 0  and when loop iterate the next digit is incremented and gets returned
            digits[i]=0;
        }
        //if the digits length is to be incremented then make the first digit as 1; and return 
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}