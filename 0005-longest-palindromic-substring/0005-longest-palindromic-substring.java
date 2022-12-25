class Solution {
//     private int lo, maxLen;

     public String longestPalindrome(String s) {
// 	    int len = s.length();
// 	    if (len < 2)
// 		    return s;
	
//     for (int i = 0; i < len-1; i++) {
//      	extendPalindrome(s, i, i);  
//      	extendPalindrome(s, i, i+1);
//     }
//     return s.substring(lo, lo + maxLen);
// }

// private void extendPalindrome(String s, int j, int k) {
// 	while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
// 		j--;
// 		k++;
// 	}
// 	if (maxLen < k - j - 1) {
// 		lo = j + 1;
// 		maxLen = k - j - 1;
// 	}
// }
    
    if(s == null || s.length() == 0) {
            return "";
        }
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int start = 0;
        int end = 0;
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j <= i; j++) {
                if(s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[j+1][i-1])) {
                    dp[j][i] = true;
                }
                if(dp[j][i] && max < i - j + 1) {
                    max = i - j + 1;
                    start = j;
                    end = i;
                }
            }
        }
        return s.substring(start, end + 1);
    }
}