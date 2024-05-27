
//TC is 0(n)

public class DecodeString{
    public String decodeString(String s) {
        //for counting integers
        Stack<Integer>intcount=new Stack<>();
        //for string
        Stack<String>resultStack=new Stack<>();
        String result="";
        int index=0;
        while(index<s.length())
        {
            //first check the digit 
            if(Character.isDigit(s.charAt(index)))
            {
                int count =0;
                while(Character.isDigit(s.charAt(index)))
                {
                //calculate count eg may be single digit or decimal ie 12
                count=10*count+(s.charAt(index)-'0');
                index++;
            }
            intcount.push(count);
         }
            //push for [ opening bracket
            else if(s.charAt(index)=='[')
            {
                resultStack.push(result);
                result="";
                index++;
            }
            //for ] bracket
            else if(s.charAt(index)==']'){
                //use temp stringbuilder
                StringBuilder temp=new StringBuilder(resultStack.pop());
                int repeat=intcount.pop(); 
                for(int i=0;i<repeat;i++)
                {
                    temp.append(result);
                }
                result=temp.toString();
                index++;
            }
            else
            {
                result+=s.charAt(index);
                index++;
            }
        }
        return result;
    }
}
