import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        if(s1.length() > s2.length()) return false;
        
        for(int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }
        
        int i = 0;
        int j = s1.length();
        while(j < s2.length()) {
            if(Arrays.equals(arr1, arr2)) return true;
            arr2[s2.charAt(i) - 'a']--;
            arr2[s2.charAt(j) - 'a']++;
            i++;
            j++;
        }
        
        if(Arrays.equals(arr1, arr2)) return true;
        else
        return false;
    }
}