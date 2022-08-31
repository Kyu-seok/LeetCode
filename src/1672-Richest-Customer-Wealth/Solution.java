public class Solution {

	public int maximumWealth(int[][] accounts) {
		int maxAmount = 0;
		int numPeople = accounts.length;
		int numBank = accounts[0].length;

		for (int i = 0; i < numPeople; i++) {
			int currAmount = 0;
			for (int j = 0; j < numBank; j++) {
				currAmount += accounts[i][j];
			}
			if (currAmount > maxAmount) {
				maxAmount = currAmount;
			}
		}
		return maxAmount;
	}
}
