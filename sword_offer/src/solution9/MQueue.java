package solution9;

import java.util.Stack;

/**
 * 用两个栈来模拟队列
 * 思路：把栈1的元素全部pop出来存进栈2，再pop栈2元素即可
 * @author Administrator
 *
 */
public class MQueue {
    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();
	public static void push(int node){
		stack1.push(node);
	}
	public static int pop() throws Exception{
		if (stack1.isEmpty() && stack2.isEmpty()) {
			throw new Exception("栈为空！");
		}
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}
