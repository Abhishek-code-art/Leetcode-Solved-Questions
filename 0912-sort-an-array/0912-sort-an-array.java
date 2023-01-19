class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length == 1) return nums;
        int lo = 0;
        int hi = nums.length-1;
        mergeSort(nums, lo, hi);
        return nums;
    }
    
    void merge(int arr[], int l, int m, int r)
    {
        int len1 = m-l+1;
        int len2 = r-m;
        
        int[] t1 = new int[len1];
        int[] t2 = new int[len2];
        
        for(int i = 0; i < len1; i++) {
            t1[i] = arr[l+i];
        }
        
        for(int j = 0; j < len2; j++) {
            t2[j] = arr[m+1+j];
        }
        
        int i = 0, j = 0;
        int index = l;
        while(i<len1 && j<len2) {
            if(t1[i] <= t2[j]) {
                arr[index++] = t1[i++];
            } else {
                arr[index++] = t2[j++];
            }
        }
        
        while(index<arr.length && i<len1) {
            arr[index++] = t1[i++];
        }
        while(index<arr.length && j<len2) {
            arr[index++] = t2[j++];
        }
    }

    // merge()
    void mergeSort(int arr[], int l, int r)
    {
        if(l >= r) return;
        
        int mid = l + (r - l) / 2;
        
        // divide the array into two halves i.e. right and left
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        // sort and merge
        merge(arr, l, mid, r);
    }
}