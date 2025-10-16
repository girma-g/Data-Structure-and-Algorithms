
// Problem: 204. Count Primes
// Link: https://leetcode.com/problems/count-primes/

class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        int count=0;
        boolean [] isPrime = new boolean [n];
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i < n; i++){
            isPrime[i] = true;
        }
        for(int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2; i < n; i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
    }
}