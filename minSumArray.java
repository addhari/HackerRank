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
public class minSumArray {
       public static void main(String[] args)
    {
    int arr[] = {1, 2, 1, 4, 0, 5, 6, 0};
    solution(arr);
    }
       
       static void solution(int[] arr)
       
       {
           Arrays.sort(arr);
           int sum=0;
           for(int i=0;i<arr.length/2;i++)  sum=sum+(arr[i]*arr[arr.length-1-i]);
           System.out.println(sum);
       }

}
