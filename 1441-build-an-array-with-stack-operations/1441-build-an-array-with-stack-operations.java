class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int[] stack = new int[target.length];
        int top = -1;
        
        for(int  i = 1; i <= n; i++) {
            if((stack.length-top) > 1) {
                top = push(ans, i, stack, top);
            }
            if(top >= 0 && target[top] != stack[top]) {
                top = pop(ans, stack, top);
            }
            if(top >= 0 && target[top] == stack[top]) {
                if(top == stack.length-1) return ans;
            }
        }
        return ans;
    }
    
    public int push(List<String> ans, int i, int[] stack, int top) {
        top++;
        stack[top] = i;
        ans.add("Push");
        return top;
    }
    
    public int pop(List<String> ans, int[] stack, int top) {
        ans.add("Pop");
        top--;
        return top;
    }
    
}