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
public class apart {

       public static void main(String[] args)
    {
        System.out.println(check("geekforgeek","geeksforgeeks",2));
        
    }
       
       
       
      static  boolean  check(String s1,String s2,int n)
      {
          
          
          if(Math.abs(s1.length()-s2.length())-n!=0)return false;
          if(s2.length()>s1.length())
          {
              String s3=s1;
              s1=s2;
              s2=s3;
          }
          if(s1.indexOf(s2)!=-1&&(s1.length()-s2.length()-n)==0)return true;
          char[] c1=s1.toCharArray();
          char[] c2=s2.toCharArray();
          int t=0;
          for(int i=0;i<s1.length();i++)
          {
              if(c1[i]!=c2[i-t])t++;
          }
     
          if(t==n)return true;
          return false;
      }
    
}
