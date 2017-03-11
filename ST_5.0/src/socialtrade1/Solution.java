package socialtrade1;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        try
        {
          int maxSum=0;
        int tempSum=0,i=0,j=0,k=0,l=0;
        for( i=0;i<3;i++)
            {
            for( j=0;j<3;j++)
                {
                
                for( k=0;k<2;k++) 
                {
           
                    for( l=0;l<2;l++) 
                    {
                        int t1=i+k;
                        int t2=j+1+l;
                         int t3=i+2+k;
                        int t4=j+l+1;
                        System.out.println(t1+","+t2+"--"+t3+","+t4);
                      // tempSum=tempSum+arr[k+i][l+j];
                  //      tempSum=tempSum -arr[i+k][j+1+l]-arr[i+2+k][j+l+1];
                        if(tempSum>maxSum)maxSum=tempSum;
                                                              
                    }
                }
                
                }
            }
        System.out.println(maxSum);
    }
    
    catch(Exception m)
    {
        m.printStackTrace();
    }
    }

}
