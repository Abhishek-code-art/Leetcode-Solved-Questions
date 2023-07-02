//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line[] = in.readLine().trim().split("\\s+");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            int l = Integer.parseInt(line[2]);
            int r = Integer.parseInt(line[3]);
            
            Solution ob = new Solution();
            System.out.println(ob.setSetBit(x, y, l, r));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int setSetBit(int x, int y, int l, int r){
        int sum = 0;
        int ans = x;
        for(int i = 1; i <= r; i++) {
            if(l<=i && i<=r) {
                int setbit_y = (y&1);
                int setbit_x = (x&1);
                if(setbit_x == 0) {
                    sum += ((int)Math.pow(2,i-1)*setbit_y);
                }
            }
            y = y>>1;
            x = x>>1;
        }
        return ans+sum;
    }
}