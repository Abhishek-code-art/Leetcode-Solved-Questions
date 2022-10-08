import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countOfValue = new HashMap<>();
        
        for(int num : arr) {
            if(countOfValue.containsKey(num)) {
                int count = countOfValue.get(num) + 1;
                countOfValue.replace(num, count);
            } else {
                countOfValue.put(num, 1);
            }
        }
        
        return (countOfValue.size() == new HashSet<>(countOfValue.values()).size());
    }
}