//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().lengthOfLongestAP(a, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    int lengthOfLongestAP(int[] A, int n) {
        if(n <= 2) return n;
        int ans = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                ans = Math.max(ans, 2+solve(i, A[j]-A[i], A));
            }
        }
        return ans;
    }
    
    private int solve(int index, int diff, int[] A) {
        if(index < 0) return 0;
        
        int ans = 0;
        for(int i = index-1; i >= 0; i--) {
            if(A[index] - A[i] == diff) {
                ans = Math.max(ans, 1+solve(i, diff, A));
            }
        }
        return ans;
    }
}