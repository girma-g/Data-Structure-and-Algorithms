
// Problem: 258. Add Digits
// Link: https://leetcode.com/problems/add-digits/

class Solution {
    public int addDigits(int num) {
        int x=num,y=num,z=0;
        while(x>=10){
            x=x/10;
            y=y%10;
            z=x+y;
            x=z;
            y=z;
        }
        if(num<10) {
            return num;
        }
        return z;
    }
}

