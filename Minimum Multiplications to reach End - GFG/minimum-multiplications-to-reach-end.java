//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int start = sc.nextInt();
            int end = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.minimumMultiplications(a, start, end);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int minimumMultiplications(int[] arr, int start, int end) { 
        int mod = (int)1e5;
        int[] d = new int[mod];
        Arrays.fill(d, (int)1e9);
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        d[start] = 0;
        
        if(start == end) return 0;
        
        while(!q.isEmpty()) {
            int node = q.poll();
            
            for(int i : arr) {
                int child = (i*node)%mod;
                
                if(d[child] > d[node] + 1) {
                    d[child] = d[node] + 1;
                    
                    if(child == end) return d[child];
                    
                    q.add(child);
                }
            }
        }
        return -1;
    }
}
