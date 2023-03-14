//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
        
        for(int i = 0; i < n; i++) {
            boolean check = true;
            for(int col = 0; col < n; col++) {
                if(M[i][col] == 1) {
                    check = false;
                }
            }
            
            for(int row = 0; row < n; row++) {
                if(row == i) continue;
                if(M[row][i] == 0) {
                    check = false;
                }
            }
            
            if(check) return i;
        }
        return -1;
    // 	Stack<Integer> st = new Stack<>();
    // 	for(int i = 0; i < n; i++) {
    // 	    st.push(i);
    // 	}
    	
    // 	while(st.size() > 1) {
    // 	    int person1 = st.peek();
    // 	    st.pop();
    // 	    int person2 = st.peek();
    // 	    st.pop();
    	    
    // 	    if(knows(M, person1, person2)) {
    // 	        st.push(person2);
    // 	    } else {
    // 	        st.push(person1);
    // 	    }
    // 	}
    // 	int candidate = st.peek();
    	
    // 	boolean rowCheck = true;
    // 	for(int i = 0; i < n; i++) {
    // 	    if(M[candidate][i] == 1) {
    // 	        rowCheck = false;
    // 	    }
    // 	}
    	
    // 	boolean colCheck = true;
    // 	for(int i = 0; i < n; i++) {
    // 	    if(i == candidate) continue;
    // 	    if(M[i][candidate] == 0) {
    // 	        colCheck = false;
    // 	    }
    // 	}
    	
    // 	if(rowCheck && colCheck) {
    // 	    return candidate;
    // 	} else {
    // 	    return -1;
    // 	}
    }
    
    private boolean knows(int[][] m, int A, int B) {
        if(m[A][B] == 1) return true;
        else return false;
    }
}