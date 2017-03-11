/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package hackerrank;

import static java.lang.Integer.SIZE;
import java.util.Stack;
import java.util.stream.IntStream;

/**
 *
 * @author Harry
 */
public class ThreeStacks {
    
    
    
    public static void main(String[] args)
    {
        
        
        int[] inputNumbers={ 3, 2, 1, 1, 1};
        int[] inputNumbers1={4, 3, 2 };
        int[] inputNumbers2={1, 1, 4, 1};
        int suma=1,sumb=2,sumc=3;
        
        Stack<Integer> sta=new Stack<Integer>();
        Stack<Integer> stb=new Stack<Integer>();
        Stack<Integer> stc=new Stack<Integer>();
        
        suma=IntStream.of(inputNumbers).sum();
        sumb=IntStream.of(inputNumbers1).sum();
        sumc=IntStream.of(inputNumbers2).sum();
        
        for(int i=inputNumbers.length-1;i>=0;i--)sta.push(inputNumbers[i]);
        for(int i=inputNumbers1.length-1;i>=0;i--)stb.push(inputNumbers1[i]);
        for(int i=inputNumbers2.length-1;i>=0;i--)stc.push(inputNumbers2[i]);
        
        
        boolean found=true;
        while(!((suma== sumb) && (sumb == sumc)))
        {
            
            int biggest=Math.max(suma, Math.max(sumb,sumc));
            
            if(biggest==suma)suma=suma-sta.pop();
              if(biggest==sumb)sumb=sumb-stb.pop();
                if(biggest==sumc)sumc=sumc-stc.pop();
          
            if(suma==0||sumb==0||sumc==0)
            {
                System.out.println("Not equall");
                found=false;
                break;
            }
        }
        
        if(found)System.out.println("MaxSum is  "+suma);
        
    }
    
}
