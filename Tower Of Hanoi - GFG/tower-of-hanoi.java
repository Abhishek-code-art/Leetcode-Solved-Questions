//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;
            
            //taking input N
            N = sc.nextInt();

            //calling toh() method 
            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}






// } Driver Code Ends


// User function Template for Java


// avoid space at the starting of the string in "move disk....."
class Hanoi {

    public long toh(int N, int from, int to, int aux) {
        // Your code here
        
        long steps = 0;
        if(N == 0)
        {
            return steps;
        }
        
        //at first we need to transfer disk from rod1 to rod2
        // so here destination is takes as aux i.e rod2
        // when the disk is transferred to rod2 increase the step count
        steps += toh(N-1,from,aux,to);
        
        
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        
        steps++;
        
        // again we need to transfer those disks from rod2 to rod3 the final destination
        // decrease the disk count in rod2
        
        steps+=toh(N-1,aux,to,from);
        return steps;
    }
}
