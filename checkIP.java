package hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Complete the function below.
 */

class checkIP
{
     public static void main(String[] args)
    {
       pointsBelongToTriangle(3,1,7,1,5,5,3,1,0,0);
       String[] test={"5154446744","515-444-6744","515-4446744;b","ee"};
       checkIPs(test);
    }
   
     
    static String[] checkIPs(String[] ip_array) {
        String str = "444222444";
Pattern p = Pattern.compile("(\\d\\d\\d)\\2");
Matcher m = p.matcher(str);
System.out.println(m.groupCount());
while (m.find()) {
	String word = m.group();
	System.out.println(word + " " + m.start() + " " + m.end());
}
        String resultSet[]=new String[ip_array.length];
        Pattern ipv4pattern = Pattern.compile( "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        Pattern ipv6pattern = Pattern.compile( "([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}");
        Pattern phonenumber=Pattern.compile("([a-z])\3");
        
         for(int i=0;i<ip_array.length;i++)
        { if(ipv4pattern.matcher(ip_array[i]).matches())resultSet[i]="IPv4";
            else if(ipv6pattern.matcher(ip_array[i]).matches())resultSet[i]="IPv6";
        else if(phonenumber.matcher(ip_array[i]).matches()){resultSet[i]="Mobile Number";System.out.println(ip_array[i]);}
        
            else resultSet[i]="Neither";
        }
    return resultSet;
    }


    static  int pointsBelongToTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int p1, int q1, int p2, int q2) {
        
        int result=0;
        double[] area=new double[3];
        area[0]=getArea( x1,  y1,  x2,  y2,  x3,  y3);
        area[1]=getArea( x1,  y1,  x2,  y2,  p1,  q1)+getArea( x1,  y1,  p1, q1,  x3,  y3)+getArea( p1,  q1,  x2,  y2,  x3,  y3);
        area[2]=getArea( x1,  y1,  x2,  y2,  p2,  q2)+getArea( x1,  y1,  p2, q2,  x3,  y3)+getArea( p2,  q2,  x2,  y2,  x3,  y3);
        
         if(area[0]==0)return 0;
        else
            {
       if(area[0]!=area[2]){result=1;}  
      if(area[0]!=area[1]){result=2;}  
         if(area[0]==area[1]&&area[0]==area[2]){result=3;}  
      if(area[0]!=area[1]&&area[0]!=area[2]){result=4;} 
            }
        System.out.println(result);
           return result;
        
    }


static double getArea(int x1, int y1, int x2, int y2, int x3, int y3)
    {
      double Calculated=Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2;
    return Calculated;
}

     /*
 * Complete the function below.
 */


     
     
}


