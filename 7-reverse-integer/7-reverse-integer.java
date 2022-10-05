class Solution {
    public int reverse(int x) {
        int answer = 0;
        int digit;
        
        while(x != 0) {
            digit = x % 10;
            
            if((answer > Integer.MAX_VALUE/10) || (answer < Integer.MIN_VALUE/10)) {
                return 0;
            }
            
            answer = answer * 10 + digit;
            x /= 10;
        }
        
        return answer;
    }
}