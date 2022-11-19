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
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    int lps(String s) {
        int i = 0, j = 1;
        int n = s.length();
        int[] prefix = new int[s.length()];
        prefix[0] = 0;
        while(j < n) {
            if(s.charAt(i) == s.charAt(j)) {
                prefix[j] = i+1;
                i++;
                j++;
            } else {
                if(i == 0) {
                    prefix[j] = 0;
                    j++;
                } else {
                    i = prefix[i-1];
                }
            }
        }
        
        return prefix[s.length() - 1];
    }
}