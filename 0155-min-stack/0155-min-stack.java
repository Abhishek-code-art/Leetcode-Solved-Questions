class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;
    int min;
    
    public MinStack() {
        this.st = new Stack<>();
        this.minStack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(st.isEmpty()) {
            st.push(val);
            minStack.push(val);
            min = val;
        } else {
            st.push(val);
            if(min >= val) {
                min = val;
                minStack.push(val);
            }
        }
    }
    
    public void pop() {
        if(!st.isEmpty()) {
            int curr = st.peek();
            st.pop();
            if(curr == min) {
                int val = minStack.pop();
                if(!minStack.isEmpty()) {
                    min = minStack.peek();    
                } else {
                    min = val;
                }
            }
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return this.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */