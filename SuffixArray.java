package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuffixArray {

	static HashSet<String> sset;
	static HashSet<String> blacklist;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] sarr = new String[n];
        for(int s_i=0; s_i < n; s_i++){
            sarr[s_i] = in.next();
        }
        
        blacklist = new HashSet<>(n/2);
        sset = new HashSet<>(Arrays.asList(sarr));
        
        CustomString[] csarr = new CustomString[n];
        for(int i = 0; i<n; i++){
        	csarr[i] = new CustomString(sarr[i]);
        }
        Arrays.sort(csarr);
        
        for(CustomString s : csarr){
        	blackListPrefix(s.s);
        }
        System.out.println(getScore(sarr));
	}
	
	static void blackListPrefix(String s){
		if(blacklist.contains(s)) return;
		// Check all prefixes - blacklist the largest
		for(int i = 1; i < s.length(); i++){
			String sub = s.substring(0, s.length() - i);
			if(sset.contains(sub)){
				blacklist.add(sub);
				break;
			}
		}
	}

	
	static long benefitValue(String s){
		char[] chars = s.toCharArray();
		long sum = 0;
		for(char c : chars){
			sum += c;
		}
		return sum;
	}
	
	static long getScore(String[] ss){
		long sum = 0;
               System.out.println(Arrays.toString(ss));
		for(String s : ss){
			if(!blacklist.contains(s)){
				sum += benefitValue(s);
			}
		}
		return sum;
	}
	
}

class CustomString implements Comparable<CustomString> {
	String s;
	
	public CustomString(String _s){
		s = _s;
	}

	@Override
	public int compareTo(CustomString o) {
		// TODO Auto-generated method stub
		return - (this.s.length() - o.s.length());
	}

	
}
