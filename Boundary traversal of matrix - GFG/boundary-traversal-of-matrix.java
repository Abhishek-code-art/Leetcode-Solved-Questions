//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            s = in.readLine().trim().split(" ");
            int ind=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[ind++]);
                }
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.boundaryTraversal(a, n, m);
            for (int i : ans) {
                out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int total = n*m;
        int row = 0;
        int col = 0;
        for(col = 0; col < m; col++) {
            if(matrix[row][col] != -1) {
                ans.add(matrix[row][col]);
                matrix[row][col] = -1;
            }
        }
        
        if(ans.size() == total) return ans;
        
        col -= 1;
        for(row = row+1; row<n; row++) {
            if(matrix[row][col] != -1) {
                ans.add(matrix[row][col]);
                matrix[row][col] = -1;
            }
        }
        
        if(ans.size() == total) return ans;
        
        row -= 1;
        for(col = col-1; col >= 0; col--) {
            if(matrix[row][col] != -1) {
                ans.add(matrix[row][col]);
                matrix[row][col] = -1;
            }
        }
        
        if(ans.size() == total) return ans;
        
        col += 1;
        for(row = row-1; row > 0; row--) {
            if(matrix[row][col] != -1) {
                ans.add(matrix[row][col]);
                matrix[row][col] = -1;
            }
        }
        
        return ans;
    }
}
