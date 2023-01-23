public class Solution {
    public boolean isAnagram(String s, String t) {

        int[] charArrS = new int[26];
        int[] charArrT = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charArrS[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            charArrT[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(charArrS, charArrT);
    }
}
