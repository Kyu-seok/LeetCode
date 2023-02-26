public class Solution {
    public int longestPalindrome(String s) {
        int freq[] = new int[52];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            } else {
                freq[26 + c - 'A']++; 
            }
        }

        int length = 0;
        boolean oddFound = false;

        for (int i = 0; i < 52; i++) {
            if (freq[i] % 2 == 0) {
                length += freq[i];
            } else {
                length += freq[i] - 1;
                oddFound = true;
            }
        }

        return oddFound ? length + 1 : length;

    }
}