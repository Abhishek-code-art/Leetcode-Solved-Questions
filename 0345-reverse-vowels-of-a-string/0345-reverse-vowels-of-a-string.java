import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] ans = s.toCharArray();
        
        while(i<j) {
            char ch1 = Character.toLowerCase(ans[i]);
            char ch2 = Character.toLowerCase(ans[j]);
            if(!(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')) {
                i++;
            } else if(!(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u')){
                j--;
            } else {
                char temp = ans[i];
                ans[i] = ans[j];
                ans[j] = temp;
                i++;
                j--;
            }
        }
        
        String res = "";
        for(char c:ans) {
            String temp = ""+c;
            res += temp;
        }
        return res;
    }
}