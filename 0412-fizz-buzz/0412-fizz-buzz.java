import java.util.*;
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i%3==0 && i%5==0) {
                ans.add(i-1, "FizzBuzz");
            } else if(i%3==0) ans.add(i-1, "Fizz");
            else if(i%5==0) ans.add(i-1, "Buzz");
            else ans.add(i-1, ""+i);
        }
        
        return ans;
    }
}