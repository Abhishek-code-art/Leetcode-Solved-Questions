//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int first = firstOccur(arr, x, n);
        int last = lastOccur(arr, x, n);
        
        ans.add(first);
        ans.add(last);
        return ans;
    }
    
    private int firstOccur(int[] arr, int x, int n) {
        int ans = -1;
        
        int lo = 0, hi = n-1;
        while(lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if(arr[mid] == x) {
                ans = mid;
                hi = mid-1;
            } else if(arr[mid] > x) {
                hi = mid-1;
            } else {
                lo = mid+1;
            }
        }
        return ans;
    }
    
    private int lastOccur(int[] arr, int x, int n) {
        int ans = -1;
        int lo = 0, hi = n-1;
        
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == x) {
                ans = mid;
                lo = mid+1;
            } else if(arr[mid] < x) {
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        return ans;
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Integer> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends