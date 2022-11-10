class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        char[] stack = new char[n];
        int[] count = new int[n];
        int i = 0;
        for(int j = 0; j < n; ++j,++i) {
            stack[i] = s.charAt(j);
            count[i] = i > 0 && stack[i-1] == s.charAt(j) ? count[i-1] + 1:1;
            if(count[i] == k) i -= k;
        }
        
        return new String(stack, 0, i);
    }
}