package solution6;

import java.util.Stack;
/**
 * ��β��ͷ��ӡ����
 * ��Ŀ������һ�������ͷ��㣬��β��ͷ��������ӡ��ÿ���ڵ��ֵ
 * @author Administrator
 *
 */
public class PrintListNode {
    /**
     * ˼·һ������ջ���Ƚ������˼�룬�����������ΰ������ֵ���ջ��Ȼ������ջ����pop����
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
	 * ˼·2��˼·һ����ջ���洢�������뵽�õݹ���������⣬��Ϊ�ݹ����Ҽ��ջ�ṹ
	 * @param listNode
	 */
	public static void printListNodeReverse2(ListNode listNode){
		if (listNode!=null) {
				printListNodeReverse2(listNode.next);
				System.out.println(listNode.value);
		}
	}
}
