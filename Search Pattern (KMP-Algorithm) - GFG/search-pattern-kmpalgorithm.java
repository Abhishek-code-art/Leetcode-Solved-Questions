//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            if(res.size()==0)
                System.out.print(-1);
            else {
                for(int i = 0;i<res.size();i++)
                    System.out.print(res.get(i) + " ");
            }
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pat, String txt)
    {   
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        int n = txt.length();
        int m = pat.length();
        int[] prefix = calPrefix(pat, m);
        
        while(i < n) {
            if(txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
                if(j == m) {
                    ans.add(i-j+1);
                    j = prefix[j-1];
                }
            } else {
                if(j != 0) {
                    j = prefix[j-1];
                } else {
                    i++;
                }
            }
        }
        return ans;
    }
    
    public int[] calPrefix(String pat, int m) {
        int i = 0, j = 1;
        int[] prefix = new int[m];
        prefix[0] = 0;
        while(j < m) {
            if(pat.charAt(i) == pat.charAt(j)) {
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
        return prefix;
    } 
    
}