//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        int srcx = 0;
        int srcy = 0;
        
        if(m[0][0] == 0) return ans;
        
        String path = "";
        solve(m, n, ans, srcx, srcy, path);
        Collections.sort(ans);
        return ans;
    }
    
    public static void solve(int[][] m, int n, ArrayList<String> ans, int x, int y, String path) {
        // base case 
        if(x == n-1 && y == n-1) {
            ans.add(path);
            return;
        }
        
        m[x][y] ^= 1;
        
        int newx = x+1;
        int newy = y;
        
        if(isSafe(newx, newy, n, m)) {
            path += "D";
            solve(m, n, ans, newx, newy, path);
            path = path.substring(0, path.length()-1);
        }
        
        newx = x;
        newy = y+1;
        if(isSafe(newx, newy, n, m)) {
            path += "R";
            solve(m, n, ans, newx, newy, path);
            path = path.substring(0, path.length()-1);
        }
        
        newx = x;
        newy = y-1;
        if(isSafe(newx, newy, n, m)) {
            path += "L";
            solve(m, n, ans, newx, newy, path);
            path = path.substring(0, path.length()-1);
        }
        
        newx = x-1;
        newy = y;
        if(isSafe(newx, newy, n, m)) {
            path += "U";
            solve(m, n, ans, newx, newy, path);
            path = path.substring(0, path.length()-1);
        }
        
        m[x][y] ^= 1;
    }
    
    public static boolean isSafe(int x, int y, int n, int[][] m) {
        if((x>=0 && x<n) && (y>=0 && y<n) && m[x][y] == 1) return true;
        else return false;
    }
}