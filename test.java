package hackerrank;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

class Test
{
    
    
    
    
    void prime(int n)
    {
        BigInteger b=new BigInteger(""+n);
        System.out.println(b.nextProbablePrime());
       
    }
    
    
        
    void add(List <? extends  Number> gg)
    {
        
    }
    public static void main(String[] args)
    {   
      Parser parser=new Parser();
      parser.matchBraces();
      
        String filename = "file.ser";
         
        // Serialization 
        try
        {   
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
             
            // Method for serialization of object
            out.writeObject(parser);
             
            out.close();
            file.close();
             
            System.out.println("Object has been serialized");
 
        }
         
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
 
        loop1:
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                loop2:
                for(int k=0;k<10;k++)
                {
                  
                    Object y;
                    y=10;
                    y=";dddd";
                    y=2.3;
                    y=new Node();
                }
                
            }
        }
        Parser object1 = null;
 
        // Deserialization
        try
        {   
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
             
            // Method for deserialization of object
            object1 = (Parser)in.readObject();
             
            in.close();
            file.close();
             
            FileInputStream f=new FileInputStream("");
            ObjectInputStream ob=new ObjectInputStream(f);
            object1=(Parser) ob.readObject();
            
              List<Integer> number = Arrays.asList(2,3,4,5);
                  List<Integer> number1=number.stream().map(x-> x*2).collect(Collectors.toList());
                  // \u000d System.out.println("comment executed");
            
            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.inputString);
            System.out.println("b = " + object1.inputString);
        }
         
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
         
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
 
    }
}