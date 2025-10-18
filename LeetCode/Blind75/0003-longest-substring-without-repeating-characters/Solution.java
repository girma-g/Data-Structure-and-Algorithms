
// Problem: 3. Longest Substring Without Repeating Characters
// Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0,  end = 0 , length = 0;
        HashSet<Character> obj = new HashSet<Character>();
        char []c = s.toCharArray();
        for(end = 0; end < c.length; end++) {
            while (obj.contains(c[end])) {
                obj.remove(c[start]);
                start++;
            }
            obj.add(c[end]);
            if (end - start + 1 > length) {
                length = end - start + 1;
            }
        }
        return length;
    }
}
