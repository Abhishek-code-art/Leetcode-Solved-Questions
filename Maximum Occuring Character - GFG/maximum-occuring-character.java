//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends




class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        int[] arr = new int[26];
        
        for(int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            
            int num = 0;
            if(ch >= 'a' && ch <= 'z') {
                num = ch - 'a';
            } else {
                num = ch - 'A';
            }
            
            arr[num]++;
        }
        
        int max = -1;
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        
        int a = 'a';
        char ans = (char)(index + a);
        return ans;
    }
    
}