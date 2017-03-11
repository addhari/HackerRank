/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Hashtable;

/**
 *
 * @author Harry
 */
public class sum1 {
        public static void main(String[] args)
    {
          int a1[] = { 1 , 2 , 3 , 4 , 5 };
    int a2[] = { 2 , 3 , 6 , 1 , 2 };
    int a3[] = { 3 , 2 , 4 , 5 , 6 };
    int sum = 12;
         if(findsum(sum,a1, a2, a3))System.out.println("YES");
         else System.out.println("NO");
    }
        
        
        
        static boolean  findsum(int sum,int[] a1,int[] a2,int[] a3)
        {
            Hashtable<Integer,Integer> h1=new Hashtable<Integer,Integer>();
            for(int i:a1)h1.put(i,1);
            
            for(int j:a2)
                for(int k:a3)
                {
                    try
                    {
                        if(h1.containsKey(sum-j-k))return true;
                        
                    }
                    catch(Exception m)
                    {
                        
                    }
                    
                }
            
            return false;
        }
}
