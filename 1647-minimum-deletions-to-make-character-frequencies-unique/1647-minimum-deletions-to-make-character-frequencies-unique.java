class Solution {
    public int minDeletions(String s) {
        int[] count = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;
        }
        
        int delete = 0;
        Set<Integer> uniq = new HashSet<>();
        for(int i = 0; i < 26; i++) {
            int freq = count[i];
            while(freq > 0) {
                if(!uniq.contains(freq)) {
                    uniq.add(freq);
                    break;
                } else {
                    freq--;
                    delete++;
                }
            }
        }
        
        return delete;
    }
}