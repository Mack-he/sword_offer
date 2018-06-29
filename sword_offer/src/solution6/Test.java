package solution6;

public class Test {

	public static void main(String[] args) {
		ListNode l1 = new ListNode();
		ListNode l2 = new ListNode();
		ListNode l3 = new ListNode();
		l1.next = l2;
		l2.next = l3;
		l1.value = 1;
		l2.value = 2;
		l3.value = 3;
		PrintListNode.printListNodeReverse2(l1);
	}
}
