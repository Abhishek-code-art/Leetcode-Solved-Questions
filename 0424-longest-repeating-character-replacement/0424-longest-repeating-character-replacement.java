class Solution {
    public int characterReplacement(String s, int k) {
        int[] charCount = new int[26];
        int i = 0;
        int j = 0;
        int max = 0;
        int mostFreqChar = 0;
        
        while(j < s.length()) {
            charCount[s.charAt(j) - 'A']++;
            mostFreqChar = Math.max(mostFreqChar, charCount[s.charAt(j) - 'A']);
            
            int charToChange = (j-i+1) - mostFreqChar;
            if(charToChange > k) {
                charCount[s.charAt(i) - 'A']--;
                i++;
            }
            max = Math.max(max, (j-i+1));
            j++;
        }
        return max;
    }
}