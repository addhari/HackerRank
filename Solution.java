package hackerrank;

import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        int maxSum=0;
        int data[][]=new int[6][6];
        
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                data[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<=3;i++)
        {
            
            for(int j=0;j<=3;j++)
            {
                int tempSum=0;
                
                for(int k=i;k<i+3;k++)
                {
                    for(int l=j;l<j+3;l++)
                    {
                        tempSum=tempSum+data[k][l];
                    //  System.out.print(tempSum+","+data[k][l]+";");
                    }
            
                }
                int t1=j+1;
                int t2=i+2;
            //    System.out.println(i+","+t1+","+data[j+1][i]+"------"+t2+","+t1+","+data[j+1][i+2]);
               
                tempSum=tempSum-data[i][j+1]-data[i+2][j+1];
          //      System.out.println("=="+tempSum+","+data[i][j+1]+","+data[i+2][j+1]);
                if(tempSum>maxSum)maxSum=tempSum;
             System.out.println(""+tempSum);
            }
        }
    }
}