//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            String s[]=in.readLine().trim().split(" ");
            String a = s[0];
            String b = s[1];
            Solution g = new Solution();
            if(g.isScramble(a,b)){
                out.println("Yes");
            }
            else{
                out.println("No");
            }
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean isScramble(String a,String b)
    {
        if(a.length() == 0 && b.length() == 0) return true;
        Map<String, Boolean> dp = new HashMap<>();
        return solve(a,b,dp);
    }
    
    private static boolean solve(String a, String b, Map<String, Boolean> dp) {
        if(a.equals(b)) return true;
        if(a.length() <= 1) return false;
        
        String key = a + " " + b;
        if(dp.containsKey(key)) return (boolean)dp.get(key);
        
        int n = a.length();
        boolean flag = false;
        for(int j = 1; j < n; j++) {
            if(solve(a.substring(0,j), b.substring(n-j,n), dp) &&
            solve(a.substring(j,n), b.substring(0,n-j), dp)) {
                flag = true;
                break;
            }
            
            if(solve(a.substring(0,j), b.substring(0,j), dp) &&
            solve(a.substring(j), b.substring(j), dp)) {
                flag = true;
                break;
            }
        }
        
        dp.put(key,flag);
        return flag;
    }
}
