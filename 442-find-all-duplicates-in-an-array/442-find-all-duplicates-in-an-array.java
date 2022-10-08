class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        
        Set<Integer> uniqueValues = new HashSet<>();
        
        for(int num : nums) {
            if(!uniqueValues.add(num)) {
                duplicates.add(num);
            }
        }
        
        return duplicates;
    }
}