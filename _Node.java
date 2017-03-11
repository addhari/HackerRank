package hackerrank;

import java.util.HashSet;
import java.util.Stack;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author Harry
 */
class _Node {
    
    _Node next=null;
    int data;
    
    public static void main(String[] args)
    {
        _Node node=new _Node();
        node.InsertNth(node,1,0);
            node.InsertNth(node,2,1);
                node.InsertNth(node,3,2);
                    node.InsertNth(node,4,1);
                        node.InsertNth(node,5,1);
        node.printList(node);
    }
    
    
    _Node InsertNth(_Node head, int data, int position) {
        _Node childNode=new _Node();
        childNode.data=data;
        int counter=0;
        if(head==null) return childNode;
        else
        {
            while(counter<position&&head!=null)head=head.next;
            if(head!=null)childNode.next=head.next;
            head.next=childNode;
            
        }
     printList(head);
        return head;
    }
    
    boolean intersection(_Node n1,_Node n2)
    {
        int diff=getSizeOfNode(n1)-getSizeOfNode(n2);
   
        if(diff<0)while(diff++!=0) n2=n2.next;
        else if (diff>0)while(diff--!=0) n1=n1.next;
       Stack<Integer> st=new Stack<Integer>();
       while(n1.data==n2.data)
       {
          st.push(n1.data);
          n1=n1.next;n2=n2.next;
         
        }
       if(!st.isEmpty())return false;
        return true;
    }
     _Node()
    {
      
    }
    
    _Node(int data)
    {
        this.data=data;
    }
    
    _Node appaend(int data)
    {
        _Node node=this;
        while(node.next!=null)
        {
            node=node.next;
        }
        _Node tailNode=new _Node(data);
        
        node.next=tailNode;
        
        return node;
    }
    
    
    _Node Insert(_Node head,int data) {
        _Node tailNode=new _Node();
        tailNode.data=data;
        if(head!=null){
            System.out.println("if loop ");
            while(head!=null)  head=head.next;
            head=tailNode;
        }
        else
        {
            System.out.println("else");
            head= tailNode;
        }
        return head;
        
    }

    
    boolean palindrome(_Node node)
    {
        try
        {
        printList(node);
        Stack<Integer> st=new Stack<Integer>();
        _Node pacer=node;
        if(node.next.next==null) return false;
        while(pacer!=null&&pacer.next!=null)
        {
   
            st.add(node.data);
            node=node.next;
            pacer=pacer.next.next;
        }
     if(pacer!=null)  st.add(node.next.data);
    
    while(!st.isEmpty())
    {
        if(st.pop()!=node.data) return false;
        node=node.next;
    }
    
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return true;
    }
    _Node appaend(_Node node,int data)
    {
        
        
        while(node!=null)
        {
            node=node.next;
        }
        _Node n=new _Node(data);
        node.next=n;
        System.out.println("end ");
        printList(node);
        return node;
    }
    
    void addTowLists(_Node n1,_Node n2)
    {
        printList(n1);
        printList(n2);
        _Node result=null;
        int sizeDiff=getSizeOfNode(n1)-getSizeOfNode(n2);
        while(sizeDiff>0){n2.appaend(0);sizeDiff--;}
        while(sizeDiff<0){n1.appaend(0);sizeDiff++;}
        int sum=0,carry=0;
        while(n1!=null)
        {
            sum=n1.data+n2.data+carry;
            
            carry=sum/10;
            sum=sum%10;
            System.out.println("  n1 "+n1.data+",,"+n2.data+","+sum+","+carry);
            result=this.appaend(result,sum);
            sum=0;
            n1=n1.next;
            n2=n2.next;
            
        }
        printList(result);
    }
    
    
    int getSizeOfNode(_Node node)
    {
        int size=0;
        while(node!=null)
        {
            node=node.next;
            size++;
        }
        return size;
        
    }
    void DeltetDups(_Node n)
    {
        HashSet<Integer> hs=new HashSet<Integer>();
        _Node previous=null;
        while(n!=null)
        {
            if(hs.contains(n.data))
            {
                previous.next=n.next;
            }
            else
            {
                hs.add(n.data);
                previous=n;
            }
            n=n.next;
        }
        
        
        
    }
    
    
    void deleteMiddleNode(_Node n)
    {
        _Node slower=n;
        _Node pacer=n.next.next;
        _Node previous=null;
        while(pacer!=null&&pacer.next!=null)
        {
            previous=slower;
            slower=slower.next;
            pacer=pacer.next.next;
            
        }
        System.out.println("slow "+slower.data);
        if(pacer!=null)
            slower=slower.next;
        
        previous.next.next=slower.next;
        
        
    }
    
    void printList(_Node n)
    {
        System.out.println("** ");
        while(n!=null){
            System.out.print(" "+n.data);
            n=n.next;
        }
        
        System.out.println("**");
    }
    
    
    
    
    
}
