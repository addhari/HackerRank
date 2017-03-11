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
public class BitOperations {
    
    int num=13;
    
        public static void main(String[] args)
    {
        BitOperations b=new BitOperations();
        b.check();
    
    }
     void check()
    {
        String binaryValue=Integer.toBinaryString(num);
        System.out.println(binaryValue);
        System.out.println(setBit(1));
    }
    

   byte getBit(int position)
{
  
    return (byte)((num>>position)&1);

}
     int setBit(int position)
{
  
    return (num>>position)|1;

}
 
    
}
