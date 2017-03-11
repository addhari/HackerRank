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
public class dd {
    
    public static void main(String[] args)
    {
        
        dd d=new dd();
        d.permutation("harry");
        
    }
    public static void permutation(String str) {
        permutation("", str);
    }
    
    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
    
    
    void p(String p,String s)
    {
        int n=s.length();
        if(n==0)System.out.println(p);
        else{
            for(int i=0;i<n;i++)
            {
                p(p+s.charAt(i),s.substring(0,i+1)+s.substring(i+1,n));
            }
        }
        
        
    }
    static String[] checkDivisibility(String[] arr) {
        String[] strings = arr;
        String[] lastDigits=new String[6];
        String[] results=new String[arr.length];
        String result="NO";
        
        for(int i=0;i<strings.length;i++)
        {
            for(int j=i+1;j<strings.length;i++)
            {
                for(int k=j+1;k<strings.length;k++)
                {
                    
                    lastDigits[0]=strings[i]+strings[j]+strings[k];
                    lastDigits[1]=strings[i]+strings[k]+strings[j];
                    lastDigits[2]=strings[j]+strings[k]+strings[i];
                    lastDigits[3]=strings[j]+strings[k]+strings[i];
                    lastDigits[4]=strings[k]+strings[j]+strings[k];
                    lastDigits[5]=strings[k]+strings[k]+strings[j];
                    
                    for(int ii=0;ii<6;ii++)
                    {
                        results[i]="NO";
                        int n=0;
                        if(lastDigits[i].charAt(0)=='0')
                            n=Integer.parseInt(lastDigits[ii].substring(1));
                        else
                            n=Integer.parseInt(lastDigits[ii]);
                        if(n%8==0)
                        {
                            results[i]="YES";
                            k=strings.length+1;
                            break;
                        }
                        
                    }
                    
                }
            }
        }
        return results;
    }
    
    
    
    
}
