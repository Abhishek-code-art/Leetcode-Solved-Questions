class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String temp = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(isValid(s.charAt(i))) {
                temp += s.charAt(i);
            }
        }
        
        int i = 0;
        int j = temp.length() - 1;
        
        while(i <= j) {
            if(temp.charAt(i) != temp.charAt(j)) {
                return false;
            } 
            
            i++;
            j--;
        }
        
        return true;
    }
    
    public boolean isValid(char ch) {
        if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) return true;
        else return false;
    }
}