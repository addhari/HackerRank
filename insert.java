/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package hackerrank;

import static hackerrank.insertData.stmt;

/**
 *
 * @author Harry
 */
public class insert extends Thread {
    
  
    String query="";
      
  insert(String query )
    {
        this.query=query;
        System.out.println(   this.query);
        
    }
    public void run()
    {
        insert();
    }
    
    void insert()
    {
        try
        {
          
            stmt.executeUpdate(query);
              
        }
        catch(Exception m)
        {
            
        }
    }
}
