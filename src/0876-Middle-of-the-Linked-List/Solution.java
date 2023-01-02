public class Solution {

	public ListNode middleNode(ListNode head) {
		int size = 1;

		ListNode temp = head;

		while(temp.next != null) {
			size++;
			temp = temp.next;
		}

		ListNode newHead = head;

		for (int i = 0; i < size / 2; i++) {
			newHead = newHead.next;
		}

		return newHead;

    }

}
