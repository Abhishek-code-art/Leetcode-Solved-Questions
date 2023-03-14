//{ Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}
// } Driver Code Ends


/*Complete the function given below*/
class Solution {
    public int maxArea(int M[][], int n, int m) {
        int ans = largestRectangleArea(M[0], m);
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(M[i][j] == 0) {
                    M[i][j] = 0;
                } else {
                    M[i][j] = M[i][j] + M[i-1][j];
                }
            }
            
            ans = Math.max(ans, largestRectangleArea(M[i], m));
        }
        return ans;
    }
    
    private int largestRectangleArea(int[] arr, int m) {
        int[] prev = prevSmallerElement(arr, m);
        int[] next = nextSmallerElement(arr, m);
        int ans = 0;
        for(int i = 0; i < m; i++) {
            int length = arr[i];
            if(next[i] == -1) {
                next[i] = m;
            }
            int breadth = next[i] - prev[i] - 1;
            
            ans = Math.max(ans, length*breadth);
        }
        return ans;
    }
    
    private int[] nextSmallerElement(int[] arr, int m) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[m];
        st.push(-1);
        for(int i = m-1; i>=0; i--) {
            int curr = arr[i];
            while(st.peek() != -1 && arr[st.peek()] >= curr) {
                st.pop();
            }
            
            ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }
    
     private int[] prevSmallerElement(int[] arr, int m) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[m];
        st.push(-1);
        for(int i = 0; i<m; i++) {
            int curr = arr[i];
            while(st.peek() != -1 && arr[st.peek()] >= curr) {
                st.pop();
            }
            
            ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }
}