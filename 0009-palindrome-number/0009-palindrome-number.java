class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int ans = 0;
        int digit;
        
        if(x < 0 || (x != 0 && x%10 == 0)) return false;
        
        while(x != 0) {
            digit = x % 10;
            ans = (ans*10) + digit;
            x/=10;
        }
        
        return (ans == temp);
    }
}