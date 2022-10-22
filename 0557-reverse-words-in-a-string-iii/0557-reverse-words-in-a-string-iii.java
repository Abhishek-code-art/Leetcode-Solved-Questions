class Solution {
    public String reverseWords(String s) {        
        String[] str = s.split(" ");
        
        for(int i = 0; i < str.length; i++) {
            reverse(str, i);
        }
        
        String res = "";
        for(int i = 0; i < str.length; i++) {
            if(str.length - 1 == i) {
                res += str[i];
                break;
            }
            
            res += str[i] + " ";
        }
        
        return res;
    }
    
    public void reverse(String[] str, int i) {
        String temp = "";
        
        for(int j = str[i].length() - 1; j >= 0; j--) {
            temp += str[i].charAt(j);
        }
        
        str[i] = temp;
    }
}