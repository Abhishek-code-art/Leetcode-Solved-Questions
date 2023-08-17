//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int num[] = new int[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(str[i]);
            }

            Vector<Integer> ans = new Solution().generateNextPalindrome(num, n);
            for (Integer x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    Vector<Integer> generateNextPalindrome(int num[], int n) {
        Vector<Integer> ans = new Vector<>();
        if(n == 1) {
            if(num[0] == 9) {
                ans.add(1);
                ans.add(1);
                return ans;
            }
            else {
                ans.add(num[0]+1);
                return ans;
            }
        }
        
        boolean change = true;
        for(int i = 0; i < n/2; i++) {
            if(num[i] < num[n-i-1]) {
                change = true;
            } else if(num[i] > num[n-i-1]) {
                change = false;
            }
            num[n-i-1] = num[i];
        }
        
        for(int i = 0; i < n; i++) {
            ans.add(num[i]);
        }
        
        int mid = n/2;
        while(change && mid < n) {
            if(ans.get(mid) == 9) {
                ans.set(mid, 0);
                ans.set(n-mid-1,0);
            } else {
                ans.set(mid, ans.get(mid)+1);
                ans.set(n-mid-1, ans.get(mid));
                change = false;
            }
            mid++;
        }
        
        if(change) {
            ans.set(0, 1);
            ans.add(1);
        }
        return ans;
    }
}