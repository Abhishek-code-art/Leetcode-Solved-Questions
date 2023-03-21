//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        Map<Character, Integer> count = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        String ans = "";
        
        for(int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            
            count.put(ch, count.getOrDefault(ch, 0) + 1);
            q.add(ch);
            
            while(!q.isEmpty()) {
                if(count.get(q.peek()) > 1) {
                    q.poll();
                } else {
                    ans = ans + q.peek();
                    break;
                }
            }
            
            if(q.isEmpty()) {
                ans = ans + "#";
            }
        }
        return ans;
    }
}