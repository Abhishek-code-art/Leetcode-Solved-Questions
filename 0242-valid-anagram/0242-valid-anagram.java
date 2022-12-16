class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] ans = new int[26];
        for(char ch : s.toCharArray()) {
            ans[ch - 'a']++;
        }
        
        for(char ch : t.toCharArray()) {
            ans[ch - 'a']--;
        }
        
        for(int a : ans) {
            if(a != 0) return false;
        }
        return true;
    }
}