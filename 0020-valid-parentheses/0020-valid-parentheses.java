class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                ans.push(')');
            } else if(ch == '{') {
                ans.push('}');
            } else if(ch == '[') {
                ans.push(']');
            } else if(ans.isEmpty() || ans.pop() != ch) {
                return false;
            }
        }
        return ans.isEmpty();
    }
}