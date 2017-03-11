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
public class CheckNumber {
    
    
    public static void main(String[] args)
    {
        CheckNumber c=new CheckNumber();
        System.out.println("result is "+c.checkNumber(100));
        
        
    }
    
    
    int  checkNumber(int n )
    {
        int i=11;
        int count=0;
        int firstDigit=Integer.parseInt(Integer.toString(i).substring(0, 1));
        if(n<=0)return 0;
        if(n<10) return n;
        while(i<=n)
        {
            int tempNum=i;
            firstDigit=Integer.parseInt(Integer.toString(i).substring(0, 1));
            while(tempNum>=10)
            {
               if(tempNum%10<firstDigit)break;
                tempNum=tempNum/10;     
            }
            if(tempNum<10)count++;
           
            i++;
        }
        return count+9;
    }
    
    
    
}
