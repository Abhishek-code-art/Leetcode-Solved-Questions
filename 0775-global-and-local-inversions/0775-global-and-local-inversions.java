class Solution {
    private int global = 0;
    public boolean isIdealPermutation(int[] nums) {  
        int local = 0;
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] > nums[i+1]) local+=1;
        }
        
        mergeSort(nums, 0, nums.length-1);
        return global==local;
    }
    
    public void mergeSort(int[] nums, int lo, int hi) {
        if(lo < hi) {
            int mid = lo + (hi-lo)/2;
            mergeSort(nums, lo, mid);
            mergeSort(nums, mid+1, hi);
            
            merge(nums, lo, mid, hi);
        }
    }
    
    public void merge(int[] nums, int lo, int mid, int hi) {
        int l1 = mid-lo+1;
        int l2 = hi-mid;
        
        int[] t1 = new int[l1];
        int[] t2 = new int[l2];
        
        for(int i = 0; i<l1; i++) {
            t1[i] = nums[i+lo];
        }
        
        for(int j = 0; j < l2; j++) {
            t2[j] = nums[mid+1+j];
        }
        
        int i = 0, j = 0;
        int index = lo;
        
        while(i<l1 && j<l2) {
            if(t1[i] <= t2[j]) {
                nums[index++] = t1[i++];
            } else {
                global += l1-i;
                nums[index++] = t2[j++];
            }
        }
        
        while(index<nums.length && i<l1) {
            nums[index++] = t1[i++];
        }
        
        while(index<nums.length && j<l2) {
            nums[index++] = t2[j++];
        }
    }
}