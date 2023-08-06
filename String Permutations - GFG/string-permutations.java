//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        ArrayList<String> ans = new ArrayList<>();
        solve(0, S.toCharArray(), ans);
        Collections.sort(ans);
        return ans;
    }
    
    private void solve(int i, char[] arr, ArrayList<String> ans) {
        if(i == arr.length-1) {
            ans.add(new String(arr));
            return;
        }
        
        for(int j = i; j < arr.length; j++) {
            swap(arr,i,j);
            solve(i+1,arr,ans);
            swap(arr,i,j);
        }
    }
    
    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
