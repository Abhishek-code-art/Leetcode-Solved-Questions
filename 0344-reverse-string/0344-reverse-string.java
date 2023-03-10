class Solution {
    char[] stack;
    int top;
    public void reverseString(char[] s) {
        stack = new char[s.length];
        top = -1;
        for(int i = 0; i < s.length; i++) {
            push(stack, s[i]);
        }
        
        for(int i = 0; i < stack.length; i++) {
            s[i] = pop();
        }
        
    }
    
    private void push(char[] stack, char element) {
        if(stack.length-top > 1) {
            this.top++;
            stack[this.top] = element;
        }
    }
    
    private char pop() {
        if(this.top >= 0) {
            char ans = stack[this.top];
            this.top--;
            return ans;
        } else {
            return (char)-1;
        }
    }
}