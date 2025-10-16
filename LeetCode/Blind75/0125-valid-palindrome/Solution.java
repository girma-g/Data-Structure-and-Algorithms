
// Problem: 125. Valid Palindrome
// Link: https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        String filtered = s.replaceAll("[^a-zA-Z0-9]", "");
        String sLower = filtered.toLowerCase();
        StringBuilder nextS = new StringBuilder(sLower);
        String t = nextS.reverse().toString();
        if(sLower.equals(t)){
            return true;
        }
        return false;
    }
}