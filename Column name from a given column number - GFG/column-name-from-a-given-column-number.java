//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
    		System.out.println (new Solution().colName (n));
        }
        
    }
}

// Contributed By: Pranay Bansal 

// } Driver Code Ends


//User function Template for Java

class Solution
{
    String colName (long n)
    {
        StringBuilder ans = new StringBuilder("");
        while(n > 0) {
            long num = n%26;
            n = n/26;
            
            if(num == 0) {
                ans.append('Z');
                n--;
            } else {
                char ch = (char)('A'+num-1);
                ans.append(ch);
            }
        }
        
        return ans.reverse().toString();
    }
}