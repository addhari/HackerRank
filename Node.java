/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

/**
 *
 * @author Harry
 */
public class Node{
    Node left,right;
    int data;
    
    
    public static void main(String[] args)
    {
        Node node=new Node();
        
        node.top_view(node);
        
    }
  
    
    
    
    void v(Stack<? extends Number> ff)
    {
        
    }
    void top_view(Node root)
{
    Deque<Integer>  d=new LinkedList<>();
    d.addLast(1);
    d.add(2);
    d.getFirst();
    d.getLast();
  Iterator reverse = d.descendingIterator();
    System.out.println(d.peek());
    d.poll();
   HashMap<Integer,List> mp=new HashMap<Integer,List>();
   LinkedList<String> ls=new LinkedList<String>();
   ls.add("harry");
   ls.add("sai");
   ls.add("harsha");
   ls.add("Vinny");
   ls.add("Sneha");
   mp.put(1, ls);
   mp.put(2, ls);
   mp.containsKey(2);
   mp.put(2, ls);
   
   
SortedMap<Integer,String> st=new TreeMap<Integer,String>();
st.put(1,"Sneha");
st.put(2,"aaaa");
st.put(3,"sxds");

  Set ss=st.entrySet();
  for(Object mq:ss)
        System.out.println(mq.toString());
 Integer [] arr = {30, 20, 40, 10};
 
        /* Collections.sort method is sorting the
        elements of arr[] in descending order. */
        Arrays.sort(arr, Collections.reverseOrder());
        Collections.swap(ls, 1, 2);
        Collections.
 
   Set< Map.Entry<Integer,List> >mm=mp.entrySet();
   Set < Map.Entry<Integer,List >> ma=mp.entrySet();
   
   
   for(Map.Entry<Integer,List> m:mm)
   {
       System.out.println(mm.toArray()+"");
   }
     // Set< Map.Entry< String,Integer> > st = mp.entrySet();  
    Stack<Integer> st=new Stack<Integer>();
    Node temp=root;
   
    while(root.left!=null)
     {
     st.push(root.data);
     root=root.left;    
     }
    root=temp;
     st.push(root.data);
    while(root.right!=null)
     {
     st.push(root.data);
     root=root.right;    
     }
while(!st.isEmpty())
    {
    System.out.print(" "+st.pop());
    }
}
    
    
}
