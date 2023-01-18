class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l = 0;
        int r = s.length()-1; 
        return recursiveApproach(s, l, r);
    }
    
    public boolean recursiveApproach(String s, int l, int r) {
        if(l > r) return true;
        
        if(s.charAt(l) != s.charAt(r)) return false;
        l++;
        r--;
        return recursiveApproach(s, l, r);
    }
}