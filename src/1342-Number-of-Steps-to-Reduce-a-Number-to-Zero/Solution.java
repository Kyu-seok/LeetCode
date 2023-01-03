public class Solution {

	public int numberOfSteps(int num) {
		int steps = 0;
		int currNum = num;

		while (currNum != 0) {
			if (currNum % 2 == 0) {
				currNum = currNum / 2;
			} else {
				currNum--;
			}
			steps++;
		}
		return steps;
	} 

}
