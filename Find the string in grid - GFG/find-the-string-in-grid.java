//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            char[][] grid = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    grid[i][j] = S.charAt(j);
                }
            }
            String word = br.readLine().trim();
            Solution obj = new Solution();
            int[][] ans = obj.searchWord(grid, word);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
            if(ans.length==0)
            {
                System.out.println("-1");
            }

        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int[][] dir = {{1,0},{0,1},{1,1},{-1,-1},{1,-1},{-1,1},{-1,0},{0,-1}};
    int n;
    int m;
    public int[][] searchWord(char[][] grid, String word)
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        n = grid.length;
        m = grid[0].length;
        int wordSize = word.length();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == word.charAt(0)) {
                    for(int k = 0; k < 8; k++) {
                        int dir_i = dir[k][0];
                        int dir_j = dir[k][1];
                        
                        if(isValid(dir_i*(wordSize-1)+i, dir_j*(wordSize-1)+j) &&
                        solve(dir_i+i,dir_j+j, grid, word, k, 1)) {
                            ArrayList<Integer> temp = new ArrayList<>();
                            temp.add(i);
                            temp.add(j);
                            ans.add(temp);
                            break;
                        }
                    }
                }
            }
        }
        
        return ans.stream().map(u -> u.stream().mapToInt(i->i).toArray()).toArray(int[][]::new);
    }
    
    private boolean solve(int i, int j, char[][] grid, String word, int k, int count) {
        if(count == word.length()) return true;
        
        if(grid[i][j] == word.charAt(count)) {
            return solve(i+dir[k][0], j+dir[k][1], grid, word, k, count+1);
        } else {
            return false;
        }
    }
    
    private boolean isValid(int i, int j) {
        if(i >= 0 && i < n && j >= 0 && j < m) return true;
        return false;
    }
}