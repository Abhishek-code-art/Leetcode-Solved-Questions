class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int ans = 0;
        int left = 0;
        int right = people.length-1;
        Arrays.sort(people);
        while(left <= right) {
            int sum = people[left] + people[right];
            
            if(sum <= limit) {
                ans++;
                left++;
                right--;
            } else {
                ans++;
                right--;
            }
        }
        return ans;
    }
} 