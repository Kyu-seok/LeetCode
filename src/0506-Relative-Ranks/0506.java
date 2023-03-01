public class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ranks = new String[score.length];

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : score) {
            pq.offer(s);
        }

        int rank = 1;
        while (!pq.isEmpty()) {
            int s = pq.poll();
            for (int i = 0; i < score.length; i++) {
                if (score[i] == s) {
                    if (rank == 1) {
                        ranks[i] = "Gold Medal";
                    } else if (rank == 2) {
                        ranks[i] = "Silver Medal";
                    } else if (rank == 3) {
                        ranks[i] = "Bronze Medal";
                    } else {
                        ranks[i] = String.valueOf(rank);
                    }
                }
            }
            rank++;
        }

        return ranks;
    }
}