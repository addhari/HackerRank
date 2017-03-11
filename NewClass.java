/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package hackerrank;

class FindDuplicate
{
    
    
    void printRepeating(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {

            if(arr[Math.abs(arr[i])]>=0){
                arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
            }
            else {
                System.out.print("  "+Math.abs(arr[i]));
            }
            
        }
        
    }
    
    
    /* Driver program to test the above function */
    public static void main(String[] args)
    {
        FindDuplicate duplicate = new FindDuplicate();
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        duplicate.printRepeating(arr);
    }
}