package hackerrank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class insertData {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/social_trade";
    static final String USER = "root";
    static final String PASS = "ron";
    static  Statement stmt = null;
    public static void main(String[] args) {
        
        
        try{
            
            BufferedReader br = null;
            FileReader fr = null;
            
            Connection conn = null;
           
            
            
            String sCurrentLine;
            String q="";
            for(int i=6;i<10;i++)
            {
            br = new BufferedReader(new FileReader("C:\\Users\\Harry\\Documents\\data\\"+i+".csv"));
            String[] d=new String[5];
              Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            while ((sCurrentLine = br.readLine()) != null) {
                d=sCurrentLine.split(",");
                if(d.length==4)
                {
                      q="INSERT INTO data " +"VALUES ("+d[0]+", '"+d[1]+"')";
                 
                    new insert(q).start();
                    Thread.sleep(10);
                }
                
            }
            System.out.println("Done"+i);
            br.close();
            
            new File("C:\\Users\\Harry\\Documents\\data\\"+i+".csv").delete();
            }
            
            
        }catch(Exception se){
            
            se.printStackTrace();
        }
        
    }
}