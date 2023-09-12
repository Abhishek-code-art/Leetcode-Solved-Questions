class Solution {
    public int minDeletions(String s) {
        int[] count = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;
        }
        
        int delete = 0;
        Arrays.sort(count);
        for(int i = 24; i >= 0; i--) {
            if(count[i] >= count[i+1]) {
                int prev = count[i];
                count[i] = Math.max(0,count[i+1] - 1);
                delete += prev - count[i];
            }
        }
        
        return delete;
    }
}