
// Problem: 5. Longest Palindromic Substring
// Link: https://leetcode.com/problems/longest-palindromic-substring/


class Solution {
public:
    string longestPalindrome(string s) {
        if (s.empty()) {
            return "";
        }
        int n = s.length();
        string longest = s.substr(0,1);
        vector<vector<bool>> values(n, vector<bool>(n));
        for (int i = 0; i < n; i++) {
            values[i][i] = true;
        }
        for (int length = 2; length <= n; length++) {
            for (int start = 0; start <= n - length; start++) {
                int end = start + length - 1;
                if (s[start] == s[end] && (length == 2 || values[start + 1][end - 1])) {
                    values[start][end] = true;
                    if (length > longest.length()) {
                        longest = s.substr(start, length);
                    }
                }
            }
        }
        return longest;
    }
};