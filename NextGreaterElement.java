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
public class NextGreaterElement {
    
    
    public static void main(String[] args)
    {
        int[] input={2,13,4,5,1,3,7,8};
        Stack<Integer> st=new Stack<Integer>();
        st.push(input[0]);
        int next=0;
        int top=0;
        for(int i=1;i<input.length;i++)
        {
            next=input[i];
            if(!st.isEmpty())
            {
                top=st.pop();
                if(next<top)
                {
                    st.push(top);
                    
                }
            }
            
        }
        System.out.println(st.toString());
        
    }
}
