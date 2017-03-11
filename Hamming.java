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


public class Hamming {


      public static void main(String[] args)
    {
    Hamming h=new Hamming();
    //h.checkHammingDistance("geeksforgeeks", "geeksandgeeks");
    int[] arr={0, 1, 15, 25, 6, 7, 30, 40, 50};
    h.minLength(arr);
    }

      
      void minLength(int[] arr)
      {
          int StartingPosition=-1;
          int endingPosition=-1;//
          for(int i=0;i<arr.length-1;i++)
          {
              if(arr[i]>arr[i+1]&&StartingPosition==-1)StartingPosition=i;
               if(arr[arr.length-i-1]<arr[arr.length-2-i]&&endingPosition==-1)endingPosition=arr.length-i-1;
            //    System.out.println(StartingPosition+","+endingPosition);
          }
         // System.out.println(StartingPosition+","+endingPosition);
         endingPosition++;
          System.out.println(StartingPosition+","+endingPosition);
      }
      int checkHammingDistance(String s1,String s2)
      {
          int count=0;
          char[] c1=s1.toCharArray();
          char[] c2=s2.toCharArray();
          if(s1.length()!=s2.length())return -1;
          for(int i=0;i<c1.length;i++)
          if(c1[i]!=c2[i])count++;
          System.out.println(count);
          return count;
      }
    
}
