class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int ans  = 0;
        int n = chars.length;
        
        while(i < n) {
            int j = i+1;
            while(j<n && chars[i] == chars[j]) {
                j++;
            }
            chars[ans++] = chars[i];
            int count = j-i;
            if(count>1) {
                String cnt = String.valueOf(count);
                for(char ch : cnt.toCharArray()) {
                    chars[ans++] = ch;
                }
            }
            i=j;
        }
        
        return ans;
    }
}