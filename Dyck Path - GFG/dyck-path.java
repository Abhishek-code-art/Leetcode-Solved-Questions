//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.dyckPaths(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long dyckPaths(int N) {
        Long res = 1L;
        
        for(int i = 0; i < N; i++) {
            res *= 2*N-i;
            res /= (i+1);
        }
        return res/(N+1);
    }
}