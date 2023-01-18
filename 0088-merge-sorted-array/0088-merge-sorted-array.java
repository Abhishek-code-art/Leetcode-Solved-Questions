class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        int i = 0;
        int j = 0;
        int ind = 0;
        while((i != m) && (j != n)) {
            if(nums1[i] <= nums2[j]) {
               temp[ind++] = nums1[i++];
            } else {
                temp[ind++] = nums2[j++];
            }
        }
        
        while(ind < (m+n) && j < n) {
            temp[ind++] = nums2[j++];
        }
        
        while(ind < (m+n) && i < m) {
            temp[ind++] = nums1[i++];
        }
        
        for(int x = 0; x < temp.length; x++) {
            nums1[x] = temp[x];
        }
    }
}