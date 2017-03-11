/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.HashSet;

/**
 *
 * @author Harry
 */
public class DeleteDUp {
    
      void DeltetDupsNoBuffer(_Node n)
      {
          _Node current=null;
                  _Node pointer=null;
                  _Node previous=null;
          while(pointer!=null)
          {
              current=pointer.next;
              previous=current;
              while(current!=null)
              {
                  if(current.data==pointer.data)
                  {
                  previous.next=current.next;
                  }
                  else
                  {
                      previous=current;
                  }
                  
              }
          }
          
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
}
