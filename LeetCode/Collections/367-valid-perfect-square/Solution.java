
// Problem: 367. Valid Perfect Square
// Link: https://leetcode.com/problems/valid-perfect-square/

class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 0;
        int high = num;
        while(low<=high){
            int mid = (low+high)/2;
            long square = (long) mid*mid;
            if(square==num){
                return true;
            }
            else if(square<num){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return false;
    }
}