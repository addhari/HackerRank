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
public class averagesArray {
    
    
      public static void main(String[] args)
    {
    int arr[] = {1, 5, 7, 2, 0};
    findEquallARrays(arr);
    }
      
      
      
      
      
      static void findEquallARrays(int[] arr)
      {
          int ls=0;
          int rs=0;
          int bp=0;
          int fp=0;
         while(bp+fp<arr.length)
          {
                if(ls/(fp+1)<=rs/(bp+1))
                {
                    ls=(ls+arr[fp++]);
                }
                else
                {
                    rs=(rs+arr[arr.length-1-bp++]);
                }
              
          }
         int e=arr.length-bp;
         fp--;
         
          System.out.println("[0,"+fp+"],["+e+","+arr.length+"]");
          
      }
      
      
      
}
