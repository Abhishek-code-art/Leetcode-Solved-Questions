//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}


// } Driver Code Ends
class Solution {
    public List<String> find_permutation(String s) {
        List<String> ans = new ArrayList<>();
        char[] output = s.toCharArray();
        int index = 0;
        solve(output, index, ans);
        Collections.sort(ans);
        int i = 0;
        while(i < ans.size()-1) {
            if(ans.get(i).equals(ans.get(i+1))) {
                ans.remove(i);
            } else {
                i++;
            }
        }
        return ans;
    }
    
    public void solve(char[] output, int index, List<String> ans) {
        if(index >= output.length) {
            if(!ans.contains(output)) {
                ans.add(new String(output));    
            }
            return;
        }
        
        for(int i = index; i < output.length; i++) {
            swap(output, index, i);
            solve(output, index+1, ans);
            swap(output, index, i);
        }
    }
    
    public void swap(char[] output, int i, int j) {
        char temp = output[i];
        output[i] = output[j];
        output[j] = temp;
    }
}