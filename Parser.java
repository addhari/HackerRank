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
public class Parser {
    
    String inputString="(){}[]";
    String checkingString="{{[][]{}}}";
    Stack<Character> st=new Stack<Character>();
    
    public static void main(String[] args)
    {
        Parser p=new Parser();
        
        if(p.matchBraces())System.out.println("Braces Matched");
        else System.out.println("Braces Not Matched");
        
    }
    
    char getClosingBrace(char ch)
    {
        int pos=0;
        char c='\0';
        for(char cc:inputString.toCharArray())   
        {
            if(cc==ch)return inputString.charAt(pos+1);
            pos++;
        }
        return c;
    }
    
    boolean  matchBraces()
    {
      
        for(char ch:checkingString.toCharArray())
        {
           
            if(isOpening(ch))
            {
                st.push(ch);   
            }
            else
            {
                if(!isClosingMatched(ch,st.pop()))
                    return false;
            }
        }
        if(st.empty())return true;
        return false;
    }
    
    boolean isOpening(char ch)
    {
       
       if(ch=='{'||ch=='('||ch=='[')
           return true;
        return false;
    }
    
    boolean  isClosingMatched(char ch,char top)
    {
       
        if(getClosingBrace(top)==ch)return true;
        return false;
       
    }
    
}
