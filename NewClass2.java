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
public class NewClass2 {
    
    
    public static void main(String[] args) {
        int[] h={1,2};
        int[] v={6,1,2,6,3,4,5,6,7,8,9,6};
        
        NewClass2 n=new NewClass2();
        //n.prison(3,2, h, v);
        n.firstAndLast(v,6);
    }
    
    
    void firstAndLast(int[] arr,int x)
    {
        
     
        int startingIndex=-1;
        int lastIndex=-1;
        for(int i=0;i<Math.floor(arr.length)&&(startingIndex==-1||lastIndex==-1);i++)
        {
            if(arr[i]==x&&startingIndex==-1)startingIndex=i;
            if(arr[arr.length-1-i]==x&&lastIndex==-1)lastIndex=arr.length-1-i;
            if((startingIndex!=-1)&&(lastIndex!=-1))break;
        }
        if(startingIndex!=lastIndex)
        System.out.println(startingIndex+","+lastIndex);
        else System.out.println("-1");
    }
    long prison(int n, int m, int[] h, int[] v) {
        
        int vMax=0;
        int hMax=0;
        int temp=2;
        Arrays.sort(h);
        Arrays.sort(v);
        if(h.length>0)hMax=2;
        if(v.length>0)vMax=2;
        for(int i=0;i<h.length-1;i++)
        {
            
            if(h[i+1]-h[i]==1)
            {
                temp++;
                if(temp>hMax) hMax=temp;
                
            }
            else 
                temp=2;
          
        }
      temp=2;
         for(int i=0;i<v.length-1;i++)
        {
            
            if(v[i+1]-v[i]==1)
            {
                temp++;
                if(temp>vMax) vMax=temp;
                
            }
            else 
                temp=2;
          
        }
     
        System.out.println(hMax+","+vMax);
        System.out.println(vMax*hMax);
        return vMax*hMax;
    }
}
