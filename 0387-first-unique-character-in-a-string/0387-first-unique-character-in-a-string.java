import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        Map<String, Integer> uniqueChar = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++) {
            String ch = s.substring(i,i+1);
            uniqueChar.put(ch, uniqueChar.getOrDefault(ch, 0) + 1);
        }
        
        String ans = "";
        for(Map.Entry<String,Integer> map:uniqueChar.entrySet()) {
            if(map.getValue() == 1) {
                ans = map.getKey();
                break;
            }
        }
        
        return (ans == "" ? -1:s.indexOf(ans));
    }
}