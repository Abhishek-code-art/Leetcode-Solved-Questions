class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> ans = new HashMap<>();
        for(char ch : s.toCharArray()) {
            ans.put(ch, ans.getOrDefault(ch, 0) + 1);
        }
        
        for(char ch : t.toCharArray()) {
            ans.put(ch, ans.getOrDefault(ch, 0) - 1);
            if(ans.get(ch) == 0) ans.remove(ch);
        }
        
        return ans.isEmpty();
    }
}