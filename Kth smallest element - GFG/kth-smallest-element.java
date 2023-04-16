//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    Solution ob = new Solution();
		    out.println(ob.kthSmallest(arr, 0, n-1, k));
		}
		out.flush();
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int kthSmallest(int[] nums, int low, int high, int k) 
    { 
        int pivot = low;
        for(int i = low; i <= high; i++) {
            if(nums[i] < nums[high]) {
                swap(nums, i, pivot++);
            }
        }
        swap(nums, pivot, high);
        
        int count = pivot - low + 1;
        if(count == k) return nums[pivot];
        else if(count > k) {
            return kthSmallest(nums, low, pivot-1, k);
        } else {
            return kthSmallest(nums, pivot+1, high, k-count);
        }
    }
    
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
