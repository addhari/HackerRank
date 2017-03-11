package hackerrank;


import java.util.HashMap;
import java.util.Map;

/*
* Complete the function below.
*/

class Airport
{
    
    
    
    public static void main(String[] args)
    {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        findMinGates(arr, dep, 6);
        
    }
    
    static int findMinGates(int[] arrivals, int[] departures, int flights) {
        
        {

            Map<Integer, Integer> freqMap = new HashMap<>();
            for (int n = 0; n < arrivals.length; n++) {
                int a = arrivals[n];
                int d = departures[n];
                for (int i = a; i < d; i++) {
                    int count = freqMap.containsKey(i) ? freqMap.get(i) : 0;
                    freqMap.put(i, count + 1);
                }
            }
            
            
            int maximumVal = 0;
            for (Integer n : freqMap.values()) {
                if (n > maximumVal) {
                    maximumVal = n;
                }
            }
            
            System.out.println("Gates needed: " +maximumVal);
            return maximumVal;
        }
    }
}
        
