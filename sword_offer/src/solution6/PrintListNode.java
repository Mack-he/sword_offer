package solution6;

import java.util.Stack;
/**
 * 从尾到头打印链表
 * 题目：输入一个链表的头结点，从尾到头反过来打印出每个节点的值
 * @author Administrator
 *
 */
public class PrintListNode {
    /**
     * 思路一：借用栈的先进后出的思想，遍历链表，依次把链表的值存进栈，然后再让栈依次pop出来
     * @param listNode
     */
	public static void printListNodeReverse1(ListNode listNode){
		Stack<ListNode> stack = new Stack<>();
		while (listNode != null) {
			stack.push(listNode);
			listNode = listNode.next;
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop().value);
		}
	}
	/**
	 * 思路2：思路一采用栈来存储，不难想到用递归来解这道题，因为递归就是壹个栈结构
	 * @param listNode
	 */
	public static void printListNodeReverse2(ListNode listNode){
		if (listNode!=null) {
				printListNodeReverse2(listNode.next);
				System.out.println(listNode.value);
		}
	}
}
