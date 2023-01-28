import java.math.BigInteger;
class Solution {
    private static final BigInteger MOD = BigInteger.valueOf(1000000007); 
    
    public int numPrimeArrangements(int n) {
        int primes = getPrimes(n);
        BigInteger x = fact(primes).mod(MOD);
        BigInteger y = fact(n-primes).mod(MOD);
        
        return (x.multiply(y).mod(MOD)).intValue();
    }
    
    public BigInteger fact(int n) {
        BigInteger ans = BigInteger.ONE;
        for(int i = 2; i <= n; i++) {
            ans = (ans.multiply(BigInteger.valueOf(i))).mod(MOD);
        }
        return ans;
    }
    
    public int getPrimes(int n) {
        int count = 0;
        boolean[] temp = new boolean[n+1];
        Arrays.fill(temp, true);
        temp[0] = temp[1] = false;
        for(int i = 2; i*i <= n; i++) {
            if(temp[i]) {
                for(int j = i*i; j <= n; j+=i) {
                    temp[j] = false;
                }
            }
        }
        
        for(int i = 0; i < temp.length; i++) {
            if(temp[i]) count++;
        }
        
        return count;
    }
}