package solution9;

import java.util.Stack;

/**
 * ������ջ��ģ�����
 * ˼·����ջ1��Ԫ��ȫ��pop�������ջ2����popջ2Ԫ�ؼ���
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
			throw new Exception("ջΪ�գ�");
		}
		if(stack2.isEmpty()){
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}
