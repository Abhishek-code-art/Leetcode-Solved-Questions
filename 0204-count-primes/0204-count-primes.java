class Solution {
    public int countPrimes(int n) {
        int cnt =  0;
        boolean[] prime = new boolean[n+1];
        if(prime.length == 1) return 0;
        prime[0]=prime[1]=true;
        for(int i = 2; i < n; i++) {
            if(!prime[i]) {
                cnt++;
                for(int j = 2*i; j < n; j=j+i) prime[j] = true;
            }
        }
        return cnt;
    }
}