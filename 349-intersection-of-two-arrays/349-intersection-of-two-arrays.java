
import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        
        for(int num : nums1) {
            set.add(num);
        }
        
        for(int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        
        int[] arr = new int[intersect.size()];
        int j = 0;
        for(int num : intersect) {
            arr[j++] = num;
        }
        
        return arr;
    }
}