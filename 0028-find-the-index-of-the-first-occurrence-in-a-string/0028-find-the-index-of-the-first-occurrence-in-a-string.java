class Solution {
    public int strStr(String text, String pat) {
        int n = text.length();
        int m = pat.length();
        
        if(n == 1 && m == 1 && text.charAt(0) == pat.charAt(0)) return 0;
        
        int[] prefix = calPrefix(pat, m);
        int i = 0, j = 0;
        
        while(i < n) {
            if(text.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            } else {
                if(j != 0) {
                    j = prefix[j-1];
                } else {
                    i++;
                }
            }
            
            if(j == m) {
                return i-j;
            }
        }
        
        return -1;
    }
    
    public int[] calPrefix(String pat, int m) {
        int i = 0, j = 1;
        int[] prefix = new int[m];
        
        prefix[0] = 0;
        while(j < m) {
            if(pat.charAt(i) == pat.charAt(j)) {
                prefix[j] = i+1;
                i++;
                j++;
            } else {
                if(i == 0) {
                    prefix[j] = 0;
                    j++;
                } else {
                    i = prefix[i-1];
                }
            }
        }
        
        return prefix;
    }
}