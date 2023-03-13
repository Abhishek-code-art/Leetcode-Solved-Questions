class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int n = prices.length;
        
        for(int i = n-1; i>=0; i--) {
            int curr = prices[i];
            while(st.peek() > curr) {
                st.pop();
            }
            int discount = (st.peek() == -1) ? 0:st.peek();
            prices[i] = curr - discount;
            st.push(curr);
        }
        return prices;
    }
}