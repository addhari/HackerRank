/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author Harry
 */
public class sub {
          public static void main(String[] args)
    {
        System.out.println(solution("geeksforgeeks","gg"));
        
    }
          
          
          static boolean  solution(String s,String s1)
          {
              char c1[]=s.toCharArray();
              char c2[]=s1.toCharArray();
              int pointer=0;      
              for(char c:c2) while(c1[pointer++]!=c){if(pointer+1>c1.length)return false;}
              return true;
          }
       
}
