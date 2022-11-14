import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i < s.length()) {
           if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
               st.push(s.charAt(i));
           } else {
               if(st.size() == 0) return false;
               char ch = st.peek();
               if(ch == '(' && s.charAt(i) == ')') {
                   st.pop();
               } else if(ch == '{' && s.charAt(i) == '}') {
                   st.pop();
               } else if(ch == '[' && s.charAt(i) == ']') {
                   st.pop();
               } else {
                   return false;
               }
           }
            i++;
        }
        return st.size() == 0 ? true:false;
    } 
}