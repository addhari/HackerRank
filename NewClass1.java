/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package hackerrank;


import java.util.Arrays;

/**
 *
 * @author Harry
 */
public class NewClass1 {
    
    
    public static void main(String[] args) {
        
        NewClass1 n=new NewClass1();
        //  int[] input={5,6,8,8,5};
        String[] input={"0 0 L","2 2 L","0 2 R"};
        //  n.rotate(input);
        //  n.countMoves2(input);
        System.out.println(n.rollingString("abcd",input));
    }
    
    
    static int MovesCount=0;
    static int lastHighestIndex=0;
    static boolean isFirstTime=true;
    static long countMoves(int[] numbers) {
        if(isValid(numbers))return MovesCount;
        MovesCount++;
        for(int i=0;i<numbers.length;i++)
            if(numbers[i]>numbers[lastHighestIndex])lastHighestIndex=i;
        numbers[lastHighestIndex]=--numbers[lastHighestIndex];
        countMoves(numbers);
        return MovesCount;
    }
    static long countMoves2(int[] numbers) {
        int smallest=numbers[0];
        int steps=0;
        for(int i=0;i<numbers.length;i++)if(numbers[0]<smallest)smallest=numbers[i];
        for(int i=0;i<numbers.length;i++)if(numbers[i]!=smallest)steps+=numbers[i]-smallest;
        System.out.println(steps);
        return steps;
    }
    static boolean isValid(int[] arr)
    {
        int fnumber=arr[0];
        for(int i:arr)
            if(fnumber!=i) return false;
        return true;
    }
    
    static int i(String i)
    {
        return Integer.parseInt(i);
    }
    
    
    static char r(int[] op,char[] c)
    {
        
        return 1;
    }
    static String rollingString(String s, String[] operations) {
        {
             String[] data=null;
            char[] cc=s.toCharArray();
            int[] TransformedArray=new int[s.length()];
            for(int i=0;i<operations.length;i++)
            {
                data=operations[i].split(" ");
                for(int j=i(data[0]);j<=i(data[1]);j++)
                {
                    if(data[2].charAt(0)=='R')
                        TransformedArray[j]=++TransformedArray[j];
                    else
                        TransformedArray[j]=--TransformedArray[j];
                }
            }
            for(int i=0;i<operations.length;i++)
                if(TransformedArray[i]%26!=0)cc[i]=(char)((TransformedArray[i]%26)+cc[i]%122);
               
           return new String(cc);
            
        }
        
        
        
    }
}
