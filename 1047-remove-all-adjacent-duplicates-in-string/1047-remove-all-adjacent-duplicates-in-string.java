import java.util.Stack;
class Solution {
    public String removeDuplicates(String s) {
        char[] stack = new char[s.length()];
        int ans = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(ans > 0 && s.charAt(i) == stack[ans-1]) {
                ans--;   
            } else {
                stack[ans++] = s.charAt(i);
            }
        }
        return new String(stack, 0, ans);
    }
}