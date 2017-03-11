/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package hackerrank;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Harry
 */
public class HackerRank {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HackerRank h=new HackerRank();
        
  String s="aabaa";
  String[] ss={"1","3 4"};
  h.countX(ss);
    }
    
   static int palindrome(String s) {

      Hashtable<String, Integer> hs = new  Hashtable<String, Integer>();
              new Hashtable<String, String>();
              String subS="";
              for(int i=0;i<=s.length();i++) 
              for(int j=i+1;j<=s.length();j++)
              {
                  subS=s.substring(i,j);
              if(isPalindrome(subS))hs.put(s.substring(i,j),1);
              }
              System.out.println(hs.size());
            
        return hs.size();
    }
 static int palindrome1(String s) {
        
       Hashtable<String, Integer> hs = new  Hashtable<String, Integer>();

       new Hashtable<String, String>();
       for(int i=0;i<s.length();i++)
           for(int j=i+1;j<s.length();j++)
               if(s.equals(new StringBuilder(s).reverse().toString()))hs.put(s.substring(i,j),1);
       System.out.println(hs.size());
       return hs.size();
    }
 
 static long countX(String[] steps) {
    
     String[] data=steps[1].split(" ");
           int x=Integer.parseInt(data[0]);
        int y=Integer.parseInt(data[1]);
       for(int i=1;i<steps.length;i++)
           {
  
           data=steps[i].split(" ");
          x=Math.min(x,Integer.parseInt(data[0]));
          y=Math.min(y,Integer.parseInt(data[1]));
           
         }
     System.out.println(x*y);
    return x*y;
    }

int verifyItems(String[] origItems, float[] origPrices, String[] items, float[] prices)
        {
    int changeCount=0;
    HashMap<String,Integer> hs=new    HashMap<String,Integer>();
    for(int i=0;i<origItems.length;i++)
    {
        hs.put(origItems[i], i);
    }
    for(int i = 0; i <items.length;i++){
        if(prices[i] != origPrices[hs.get(items[i])])
                {
            changeCount+=1;
        }
    }
 return changeCount;

}
 
 
 public static Set<CharSequence> printAllPalindromes(String input) {
    if (input.length() <= 2) {
        return Collections.emptySet();
    }
    int count=0;
    Set<CharSequence> out = new HashSet<CharSequence>();
    int length = input.length();
    for (int i = 1; i <= length; i++) {
        for (int j = i - 1, k = i; j >= 0 && k < length; j--, k++) {
            if (input.charAt(j) == input.charAt(k)) {
                out.add(input.subSequence(j, k + 1));
                count++;
            } else {
                break;
            }
        }
    }
     System.out.println("cout "+count);
    return out;
}
static boolean isPalindrome(String s)
    {
    for(int i=0;i<s.length()/2;i++) if(s.charAt(i)-s.charAt(s.length()-1)!=0)return false;
    return true;    
    }
    static int maxDifference(int[] a) {
        
        int min=0;
        int max=0;
        for(int i:a)
            if(i<min)min=i;
            else if(i>max)max=i;
        
        
        
        return max-min;
    }
    
   
    
    void palindrome(String[] arr)
    {
        
        int count=0;
        for(String s:arr)
        {
            count=0; for(int i=0;i<s.length()/2;i++)  count=count+Math.abs(s.charAt(i)-s.charAt(s.length()-i-1));
        }
       
    }
    
    
    void highestInaArray(String[] arr,int upperBound)
    {
            Stack<Integer> st=new Stack<Integer>();
        st.isEmpty();
    }
    
}
