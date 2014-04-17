package dailyCoding;

import static org.junit.Assert.*;

import org.junit.Test;

public class checkCircle {
	@Test
	public void test() {
		Solution sol = new Solution();
		ListNode cycleLL1 = new ListNode();
		ListNode cycleLL2 = new ListNode();
		ListNode cycleLL3 = new ListNode();

		ListNode unCycleLL1 = new ListNode();
		ListNode unCycleLL2 = new ListNode();
		
		cycleLL1.val = 3;
		cycleLL2.val = 2;	
		cycleLL3.val = 1;

		cycleLL1.next = cycleLL2;
		cycleLL2.next = cycleLL3;
		cycleLL3.next = cycleLL2;

		unCycleLL1.val = 4;
		unCycleLL2.val = 5;

		unCycleLL1.next = unCycleLL2;
		
		assertTrue(sol.hasCycle(cycleLL1));
		assertFalse(sol.hasCycle(unCycleLL1));
	}

}
