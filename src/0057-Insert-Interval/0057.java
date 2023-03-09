public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> arrayList = new ArrayList<>();

        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            arrayList.add(intervals[i]);
            i++;
        }

        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        arrayList.add(newInterval);

        while (i < intervals.length) {
            arrayList.add(intervals[i]);
            i++;
        }

        return arrayList.toArray(new int[arrayList.size()][]);
    }
}
