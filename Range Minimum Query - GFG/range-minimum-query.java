//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Minimum
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
              arr[i] = sc.nextInt();
              
              GfG gfg = new GfG();
            int Q = sc.nextInt();
            
            
            int st[] = gfg.constructST(arr, n);
            int l,r;
            for(int i = 0; i < Q; i++)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                l = Math.min(a,b);
                r = Math.max(a,b);
                
                System.out.print(gfg.RMQ(st, n, l, r) + " ");
                
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


/* The functions which 
builds the segment tree */
class GfG
{
    static int st[];
    
    public static int[] constructST(int arr[], int n)
    {
        st = new int[4*n];
        build(0, 0, n-1, arr);
        return st;
    }
    
    private static void build(int index, int low, int high, int[] arr) {
        if(low == high) {
            st[index] = arr[low];
            return;
        }
        
        int mid = low + (high-low)/2;
        build(2*index+1, low, mid, arr);
        build(2*index+2, mid+1, high, arr);
        
        st[index] = Math.min(st[2*index+1], st[2*index+2]);
    }
    
    
    /* The functions returns the
      min element in the range
      from l and r */
    public static int RMQ(int st[], int n, int l, int r)
    {
       return query(0,0,n-1,l,r);
    }
    
    private static int query(int index, int low, int high, int l, int r) {
        if(low >= l && high <= r) {
            return st[index];
        }
        
        if(high < l || low > r) return Integer.MAX_VALUE;
        
        int mid = low + (high-low)/2;
        int left = query(2*index+1, low, mid, l, r);
        int right = query(2*index+2, mid+1, high, l, r);
        
        return Math.min(left, right);
    }
    
    
}