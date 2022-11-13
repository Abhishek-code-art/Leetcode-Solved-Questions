class Solution {
    public int maximum69Number (int num) {
        String str = "" + num;
        String[] arr = str.split("");
        for(int i = 0; i < arr.length; i++) {
            int val = Integer.valueOf(arr[i]);
            if(val == 6) {
                arr[i] = "9";
                break;
            }
        }
        int ans = 0;
        for(int i = arr.length-1, j = 0; i >= 0; i--, j++) {
            int digit = Integer.valueOf(arr[i]);
            ans = (digit * (int)Math.pow(10,j)) + ans;
        }
        
        return ans;
    }
}