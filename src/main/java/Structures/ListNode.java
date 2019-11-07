package Structures;

public class ListNode {

	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ListNode)) {
			return false;
		}
		ListNode node = (ListNode) o;
		ListNode current = this;

		while (current != null) {
			if (current.val != node.val) {
				return false;
			}
			current = current.next;
			node = node.next;

		}
		return true;

	}
}
