class Solution {
    public int maximalRectangle(char[][] m) {
        int n = m[0].length;
        int[] arr = new int[n];
        int ans = 0;
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < n; j++) {
                if(m[i][j] == '1') {
                    arr[j] += 1;
                } else if(m[i][j] == '0') {
                    arr[j] = 0;
                }
            }
            int area = largestRectangleArea(arr, n);
            ans = Math.max(ans, area);
        }
        return ans;
    }
    
    private int largestRectangleArea(int[] arr, int m) {
        int[] prev = prevSmallerElement(arr, m);
        int[] next = nextSmallerElement(arr, m);
        int ans = 0;
        for(int i = 0; i < m; i++) {
            int length = arr[i];
            if(next[i] == -1) {
                next[i] = m;
            }
            int breadth = next[i] - prev[i] - 1;
            
            ans = Math.max(ans, length*breadth);
        }
        return ans;
    }
    
    private int[] nextSmallerElement(int[] arr, int m) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[m];
        st.push(-1);
        for(int i = m-1; i>=0; i--) {
            int curr = arr[i];
            while(st.peek() != -1 && arr[st.peek()] >= curr) {
                st.pop();
            }
            
            ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }
    
     private int[] prevSmallerElement(int[] arr, int m) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[m];
        st.push(-1);
        for(int i = 0; i<m; i++) {
            int curr = arr[i];
            while(st.peek() != -1 && arr[st.peek()] >= curr) {
                st.pop();
            }
            
            ans[i] = st.peek();
            st.push(i);
        }
        return ans;
    }
}