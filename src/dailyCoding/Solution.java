package dailyCoding;

public class Solution {
	public boolean hasCycle(ListNode head) {
		
		ListNode firstPoint = head.next.next;
		ListNode secondPoint = head.next;
		
		while(firstPoint != null && secondPoint != null){
			if(firstPoint.next == secondPoint){
				return true;
			}
			firstPoint = firstPoint.next.next;
			secondPoint = secondPoint.next;
		}
		
		return false;
	}
}