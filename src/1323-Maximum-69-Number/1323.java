public class Solution {
    public int maximum69Number (int num) {
        String number = Integer.toString(num);

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '6') {
                number = number.substring(0, i) + "9" + number.substring(i + 1);
                return Integer.parseInt(number);
            }
        }

        return num;
    }
}
