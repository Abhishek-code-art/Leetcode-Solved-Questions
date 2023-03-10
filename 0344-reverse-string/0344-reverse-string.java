class Solution {
    public void reverseString(char[] s) {
        char[] temp = new char[s.length];
        int top = -1;
        for(int i = 0; i < s.length; i++) {
            top++;
            temp[top] = s[i];
        }
        
        for(int i = 0; i < s.length; i++) {
            s[i] = temp[top];
            top--;
        }
    }
}