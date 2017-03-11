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
public class BInarySearch {
    public static void main(String[] args)
    {
        int arr[] = {2, 3};
        search(arr,3,0,arr.length);
        
    }
    
    
    static  void search(int[] arr,int element,int low,int high)
    {
        if(arr.length>1)
        {
        
        int middle=(low+high)/2;
        if(arr[middle]==element){
            System.out.println("found index "+middle);
            return;
        }
        System.out.println(middle);
        if(arr[middle]<element)
            search(arr,element,middle+1,high);
        else
            search(arr,element,low,middle);
        }
        
        
    }
    
}
