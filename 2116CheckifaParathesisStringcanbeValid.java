class Solution {
    public boolean canBeValid(String s, String locked) {
        //validate string and return true or false if we can 
        if(s.length()%2!=0){
            return false;
        }
        int balance=0;
        //move left to right
        for(int i=0;i<s.length();i++){
            if(locked.charAt(i)=='0'||s.charAt(i)=='('){
                balance++;//more opening or change opportunity
            }
            else{
                balance--;//more closing brackets
            }
              //closing brackets are more
            if(balance<0){
                return false;
            }

        }
        balance=0;
        //traverse right to left
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==')'||locked.charAt(i)=='0'){
                balance++; // it is either closing or can be changed
            }
            else{
                balance--;//it opening 
            }

             if(balance<0){//more opening brackets
            return false;
             }
        }
      
        return true;
    }
}