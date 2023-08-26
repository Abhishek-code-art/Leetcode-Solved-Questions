//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        int max = 0;
        int i = 0, j = 0;
        int n = s.length();
        Map<Character, Integer> uc = new HashMap<>();
        while(j < n) {
            uc.put(s.charAt(j), uc.getOrDefault(s.charAt(j),0)+1);
            if(uc.size() < k) {
                j++;
            } else if(uc.size() == k) {
                max = Math.max(max,j-i+1);
                j++;
            } else {
                while(uc.size() > k) {
                    char ch = s.charAt(i);
                    uc.put(ch, uc.get(ch)-1);
                    if(uc.get(ch) == 0) uc.remove(ch);
                    i++;
                }
                j++;
            }
        }
        
        return max == 0 ? -1:max;
    }
}