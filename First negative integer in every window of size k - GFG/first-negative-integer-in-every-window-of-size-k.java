//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        Deque<Integer> dq = new LinkedList<>();
        long[] ans = new long[N-K+1];
        int j = 0;
        
        for(int i = 0; i < K; i++) {
            if(A[i] < 0) {
                dq.addLast(i);
            }
        }
        
        if(!dq.isEmpty()) {
            ans[j] = A[dq.peekFirst()];
            j++;
        } else {
            ans[j++] = 0;
        }
        
        for(int i = K; i < N; i++) {
            if(!dq.isEmpty() && (i - dq.peekFirst()) >= K) {
                dq.pollFirst();
            }
            
            if(A[i] < 0) {
                dq.addLast(i);
            }
            
            if(!dq.isEmpty()) {
                ans[j++] = A[dq.peekFirst()];
            } else {
                ans[j++] = 0;
            }
        }
        return ans;
    }
}