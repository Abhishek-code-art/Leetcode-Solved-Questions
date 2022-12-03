class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> ans = new HashMap<>();
        int max = 0;
        int i = 0;
        int j = 0;
        while(j < s.length()) {
            ans.put(s.charAt(j), ans.getOrDefault(s.charAt(j), 0) + 1);
            if(ans.size() == j-i+1) {
                max = Math.max(max, j-i+1);
                j++;
            } else if(ans.size() < j-i+1) {
                while(ans.size() < j-i+1) {
                    ans.put(s.charAt(i), ans.get(s.charAt(i)) - 1);
                    if(ans.get(s.charAt(i)) == 0) ans.remove(s.charAt(i));
                    i++;
                }
                j++;
            }
        }
        
        return max;
    }
}