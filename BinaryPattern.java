package hackerrank;

import java.util.Stack;

/**
 *
 * @author Harry
 */
public class BinaryPattern {
    
    
    public static void main(String[] args)
    {
        String input="01010";
        int c1=0,c2=0;
        char ch=input.charAt(0);
        int StringCount=0;
        for(int i=0;i<input.length();i++)
        {
            ch=input.charAt(i);
            if(ch=='1'){c1++;if(c2>0){c2--;StringCount++;}}
            else {c2++;if(c1>0){c1--;StringCount++;}}
        }
        
        System.out.println(StringCount);
    }
    
}
