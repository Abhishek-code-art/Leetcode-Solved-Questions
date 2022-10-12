import java.util.*;
class Solution {
    public String minWindow(String s, String t) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < t.length(); i++) {
            map.put(t.substring(i,i+1), map.getOrDefault(t.substring(i,i+1),0) + 1);
        }
        
        int i = 0;
        int j  = 0;
        int count = map.size();
        String ans = "";
        int ansLength = Integer.MAX_VALUE;
        
        while(j < s.length()) {
            String character = s.substring(j, j+1);
            
            if(map.containsKey(character)) {
                map.put(character, map.getOrDefault(character, 0) - 1);
                if(map.get(character) == 0) count--;
            }
            
            if(count > 0) j++;
            else if(count == 0) {
                while(count == 0) {
                    if((j-i+1) < ansLength) {
                        ansLength = j-i+1;
                        ans = s.substring(i, j+1);
                    }
                    
                    String ch = s.substring(i,i+1);
                    if(map.containsKey(ch)) {
                        map.put(ch, map.get(ch) + 1);
                        if(map.get(ch) == 1) count++;
                    }
                    
                    i++;
                }
                
                j++;
            }
        }
        
        return ans;
    }
}