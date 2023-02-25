public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = (right + left) / 2;
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        return left;
    }
}