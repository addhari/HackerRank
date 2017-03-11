/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Stack;

/**
 *
 * @author Harry
 */
public class LongestSubstring {
      public static void main(String[] args)
    {
        
        String input="(()))((((()))))";
        
        int maxLength=1;
        Stack<Integer> st=new Stack<Integer>();
        st.push(-1);
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='(')st.push(1);
            else if(st.size()>1) st.pop();
            if(maxLength<st.size())maxLength=st.size();
        }
        maxLength--;
        System.out.println("max "+maxLength);
    }
    
}
