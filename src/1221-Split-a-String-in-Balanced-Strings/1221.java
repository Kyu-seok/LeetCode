public class Solution {
    public int balancedStringSplit(String s) {

        int lCount = 0;
        int rCount = 0;
        int balanceCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                lCount++;
            } else {
                rCount++;
            }

            if (lCount == rCount) {
                balanceCount++;
                lCount = 0;
                rCount = 0;
            }
        }

        return balanceCount;
    }
}
