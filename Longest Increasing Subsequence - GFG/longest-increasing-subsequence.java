//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} 
// } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int nums[])
    {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);
        
        for(int i = 1; i < nums.length; i++) {
            int n = ans.size();
            if(nums[i] > ans.get(n-1)) {
                ans.add(nums[i]);
            } else {
                int index = lowerBound(ans, nums[i], n);
                ans.set(index,nums[i]);
            }
        }
        return ans.size();
    }
    
    private static int lowerBound(ArrayList<Integer> list, int val, int n) {
        int lo = 0, hi = n-1;
        int res = 0;
        while(lo <= hi) {
            int mid = lo+(hi-lo)/2;
            if(list.get(mid) < val) {
                lo = mid+1;
            } else {
                res = mid;
                hi = mid-1;
            }
        }
        return res;
    }
} 