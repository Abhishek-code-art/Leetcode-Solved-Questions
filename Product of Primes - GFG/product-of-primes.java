//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            long L = Long.parseLong(a[0]);
            long R = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.primeProduct(L, R));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    private static long MOD = 1000000007;
    static long primeProduct(long L, long R){
        ArrayList<Long> primes = new ArrayList<>();
        getPrimes(primes, R);
        
        boolean[] dummy = new boolean[(int)(R-L+1)];
        Arrays.fill(dummy, true);
        
        for(long i : primes) {
            long low = L/i;
            if(low <= 1) {
                low = i+i;
            } else if((L%i) != 0) {
                low = (low*i) + i;
            } else {
                low = low*i;
            }
            
            for(long j = low; j <= R; j+=i) {
                dummy[(int)(j-L)] = false;
            }
        }
        
        long ans = 1;
        
        for(long i = 0; i < (R-L+1); i++) {
            if(dummy[(int)i]) {
                ans = (ans*(L+i))%MOD;
            }
        }
        return ans;
    }
    
    public static void getPrimes(ArrayList<Long> primes, long R) {
        boolean[] temp = new boolean[(int)(R+1)];
        Arrays.fill(temp, 2, (int)R+1, true);
        
        for(long i = 2; i*i <= R; i++) {
            if(temp[(int)i]) {
                for(long j = i*i; j*j <= R; j+=i) {
                    temp[(int)j] = false;
                }
            }
        }
        
        for(long i = 2; i*i <= R; i++) {
            if(temp[(int)i]) {
                primes.add(i);
            }
        }
    }
    
}