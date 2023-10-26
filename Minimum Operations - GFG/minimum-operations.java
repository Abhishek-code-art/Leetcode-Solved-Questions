//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperation(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java


class Solution
{
    public int minOperation(int n)
    {
        return solve(n);
    }
    
    private int solve(int n) {
        if(n == 2) return 2;
        if(n == 1) return 1;
        
        if(n%2 != 0) return 2+solve((n-1)/2);
        else return 1+solve(n/2);
    }
}