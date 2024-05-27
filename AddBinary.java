// Given two binary strings a and b, return their sum as a binary string.

 

// Example 1:

// Input: a = "11", b = "1"
// Output: "100"
// Example 2:

// Input: a = "1010", b = "1011"
// Output: "10101"
 

// Constraints:

// 1 <= a.length, b.length <= 104
// a and b consist only of '0' or '1' characters.
// Each string does not contain leading zeros except for the zero itself.

/**
 * Add Binary
 */
public class AddBinary {
    
    public static String addBinary(String str1,String str2 )
    {
       
        StringBuilder sb=new StringBuilder();
        int len1=str1.length()-1;
        int len2=str2.length()-1;  
        int carry=0;
        
       
        while(len1>=0||len2>=0||carry==1)
        {
            int sum=carry;
            if(len1>=0)
            {
                sum+=str1.charAt(len1--)-'0';
                //length of first string is decreased
                //carry is added
            }
            if(len2>=0)
            {
                sum+=str2.charAt(len2--)-'0';
            }
            //add or append at stringbuilder
            //append the remainder after adding eg if 1+1=2 and 2%2=0 then remainder is 0 so append that 
            sb.append(sum%2);
            //update the carry
            carry=sum/2; //if it is perfectly divisible by 2 then carry is updated as 0 else carry is 1
            //eg if 1 +1 =2 then carry should be updated as 1 right so for that if it is perfectly divisible by 2 
            //then the quotient is 1 
            //remember that always modulo gives remainder and divisor gives quotient 
        }
        //now update the stringbuilder to string as same datatype
        
        return sb.reverse().toString();
    }
}
