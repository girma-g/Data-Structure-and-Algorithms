
// Problem: 7. Reverse Integer
// Link: https://leetcode.com/problems/reverse-integer/

class Solution {
    public int reverse(int x) {
        int rev=0, num=x, sign=1;
        if(x<0){
            sign = -1;
            x = -x;
        }
        while(x>0) {
            int z = (x % 10);
            x /= 10;
            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && z>7)){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && z<-8)){
                return 0;
            }
            rev = (rev * 10) + z;
        }
        return sign*rev;
    }
}