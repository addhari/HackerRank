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
public class lcs {
    
    
    
    public static void main(String[] args)
    {
    find("harikrihna","sneha");
    }
    
    static void find(String s1,String s2)
    {
        char ch[]=s1.toCharArray();
        
        char ch1[]=s2.toCharArray();
        
        for(int i=0;i<s1.length();i++)
            System.out.println(ch[i]+","+ch1[i]);
        
        
    }
    
}
