//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.is_bleak(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int is_bleak(int n)
    {
        for(int i = 0; i < 32; i++) {
            int num = n-i;
            int setBits = 0;
            
            while(num > 0) {
                if((num&1) == 1) setBits++;
                num >>= 1;
            }
            
            if((n-i) + setBits == n) return 0;
            if(n-i < 0) break;
        }
        
        return 1;
    }
}