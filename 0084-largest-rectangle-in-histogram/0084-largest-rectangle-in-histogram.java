class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        
        int[] next = nextSmallerElement(heights, n);
        int[] prev = prevSmallerElement(heights, n);
        int ans = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++) {
            int l = heights[i];
            if(next[i] == -1) {
                next[i] = n;
            }
            int b = next[i] - prev[i] - 1;
            int area = l*b;
            ans = Math.max(area, ans);
        }
        return ans;
    }
    
    private int[] nextSmallerElement(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] indexes = new int[arr.length];
        st.push(-1);
        
        for(int i = n-1; i>=0; i--) {
            int curr = arr[i];
            while(st.peek() != -1 && arr[st.peek()] >= curr) {
                st.pop();
            }
            indexes[i] = st.peek();
            st.push(i);
        }
        return indexes;
    }
    
    private int[] prevSmallerElement(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] indexes = new int[arr.length];
        st.push(-1);

        for(int i = 0; i<n; i++) {
            int curr = arr[i];
            while(st.peek() != -1 && arr[st.peek()] >= curr) {
                st.pop();
            }
            indexes[i] = st.peek();
            st.push(i);
        }
        return indexes;
    }
}