//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    String line = sc.next();
                    Sol obj = new Sol();  
                    System.out.println(obj.wordBreak(line,arr));  
                    
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    static Map<String, Boolean> map;
    static Boolean[] dp;
    public static int wordBreak(String A, ArrayList<String> B )
    {
        map = new HashMap<>();
        dp  = new Boolean[A.length()+1];
        
        for(String s : B) {
            map.put(s, true);
        }
        
        return solve(0,A,A.length()) ? 1:0;
    }
    
    private static boolean solve(int index, String s, int n) {
        if(index >= n) return true;
        
        if(dp[index] != null) return dp[index];
        
        for(int i = index+1; i <= n; i++) {
            String temp = s.substring(index,i);
            if(map.containsKey(temp) && solve(i,s,n)) return dp[index] = true;
        }
        
        return dp[index] = false;
    }
}