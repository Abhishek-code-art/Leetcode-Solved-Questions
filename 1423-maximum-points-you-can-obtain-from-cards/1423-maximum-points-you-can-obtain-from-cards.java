class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int[] prefixSum = new int[cardPoints.length];
        int totalSum = 0;
        for(int i = 0;i < cardPoints.length; i++) {
            totalSum += cardPoints[i];
            prefixSum[i] = totalSum;
        }
        
        if(cardPoints.length == k) return totalSum;
        
        int maxScore = 0;
        int subarraySum = 0;
        for(int i = 0; i <= k; i++) {
            int j = i+cardPoints.length-k-1;
            if(i == 0) {
                subarraySum = prefixSum[j];
            } else {
                subarraySum = prefixSum[j] - prefixSum[i-1];
            }
            
           maxScore = (maxScore < (totalSum-subarraySum)) ? (totalSum-subarraySum):maxScore;
        }
        
        return maxScore;
    }
}