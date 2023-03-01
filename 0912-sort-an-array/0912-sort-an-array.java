class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
    
    public void mergeSort(int[] nums, int low, int high) {
        if(low < high) {
            int mid = low + (high-low)/2;
            
            mergeSort(nums, low, mid);
            mergeSort(nums, mid+1, high);
            
            merge(nums, low, mid, high);
        }
    }
    
    public void merge(int[] nums, int low, int mid, int high) {
        int l1 = mid - low + 1;
        int l2 = high - mid;
        
        int[] t1 = new int[l1];
        int[] t2 = new int[l2];
        
        for(int i = 0; i < l1; i++) {
            t1[i] = nums[i + low];
        }
        
        for(int j = 0; j < l2; j++) {
            t2[j] = nums[j+mid+1];
        }
        
        int i = 0, j = 0;
        int k = low;
        while(i < l1 && j < l2) {
            if(t1[i] <= t2[j]) {
                nums[k++] = t1[i++];
            } else {
                nums[k++] = t2[j++];
            }
        }
        
        while(i < l1) {
            nums[k++] = t1[i++];
        }
        
        while(j < l2) {
            nums[k++] = t2[j++];
        }
    }
} 