//import java.lang.System;
//import java.lang.Math;

public class CountPrimes 
{
    public static int countPrimes(int n) {
        int count = 0;
        
        for (int i = n; i > 1; i--) {
            boolean np = false;
            for (int j = 2; j < i; j++) {
                // test if prime
                if (i % j == 0) {
                    np = true;
                    break;
                }
                
                // increment prime count
                if (!np) {
                    count++;
                }
            }
        }
        
        return count;
    } // end of countPrimes()
    
    
    public static void main(String[] args) {
        int n = 40000;
        
        long startTime = System.nanoTime();
        CountPrimes.countPrimes(n);
        long endTime = System.nanoTime();
        
        System.out.println("time taken = " + ((double)(endTime - startTime)) / Math.pow(10, 9) + " sec");
    } // end of main()
    
} // end of class CountPrimes

