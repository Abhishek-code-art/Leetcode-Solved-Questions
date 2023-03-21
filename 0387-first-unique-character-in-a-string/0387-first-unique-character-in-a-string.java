class Solution {
    public int firstUniqChar(String s) {
        int ans = -1;
        int[] count  = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch-'a']++;
        }
        
        for(int i = 0; i < s.length(); i++) {
            if(count[s.charAt(i) - 'a'] == 1) {
                ans = i;
                break;
            }
        }
        
        return ans;
    }
}