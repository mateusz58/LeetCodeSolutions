import Structures.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ListNodeTest {

	ListNode L1;
	ListNode L2;

	@Test
	void equals1() {
		L1 = new ListNode(5);
		L1.next = new ListNode(1);
		//given
		L2 = new ListNode(5);
		L2.next = new ListNode(1);
		assertTrue(L1.equals(L2));
	}
}