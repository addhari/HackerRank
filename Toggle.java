/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package hackerrank;

import static hackerrank.sub.solution;

/**
 *
 * @author Harry
 */
public class Toggle {
    public static void main(String[] args)
    {
        System.out.println(solution("HarrYs"));
        
    }
    
    
    
    
    static String solution(String s)
    {
        char[] c1=s.toCharArray();
        int ascii=0;
        String s1="";
        for(char c:c1)
        {
            ascii=(int)c;
            char uc=(char) (c+'a'-'A');
             char lc=(char) (c-'a'-'A');
            if(ascii>=65&&ascii<=90)s1=s1+uc;
            else  if(ascii>=97&&ascii<=122)s1=s1+lc;
            else s1=s1+c;
        }
        return s1;
    }
    
}
