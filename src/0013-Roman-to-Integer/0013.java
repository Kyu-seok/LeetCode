public class Solution {
    public int romanToInt(String s) {

        int value = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'V') {
                    value = value + 4;
                    i++;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'X') {
                    value = value + 9;
                    i++;
                } else {
                    value++;
                }
            } else if (s.charAt(i) == 'V') {
                value = value + 5;
            } else if (s.charAt(i) == 'X') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
                    value = value + 40;
                    i++;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
                    value = value + 90;
                    i++;
                } else {
                    value = value + 10;
                }
            } else if (s.charAt(i) == 'L') {
                value = value + 50;
            } else if (s.charAt(i) == 'C') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'D') {
                    value = value + 400;
                    i++;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'M') {
                    value = value + 900;
                    i++;
                } else {
                    value = value + 100;
                }
            } else if (s.charAt(i) == 'D') {
                value = value + 500;
            } else if (s.charAt(i) == 'M') {
                value = value + 1000;
            }
        }
        return value;
    }
}