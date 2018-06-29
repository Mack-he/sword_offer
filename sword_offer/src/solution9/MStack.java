package solution9;

import java.util.ArrayDeque;
/**
 * ��������ʵ��һ��ջ
 * ˼·��ÿ���ڶ���һ�ж��������һ�������Ԫ�أ�����������2��Ȼ�����2�ٽ������1���ղŶ���1�����һ��Ԫ�ؾͱ���˶���Ԫ��
 * @author Administrator
 *
 */
public class MStack {
	private static ArrayDeque<Integer> queue1 = new ArrayDeque<>();
	private static ArrayDeque<Integer> queue2 = new ArrayDeque<>();
	public static void push(int node){
		queue1.add(node);
	}
	public static int pop() throws Exception{
		 if (queue1.size() <= 1) {
	            return queue1.poll();
	        } else {
	            while (queue1.size() > 1) {
	                queue2.add(queue1.poll());
	            }
	        }

	        while (queue2.size() > 0) {
	            queue1.add(queue2.poll());
	        }

	        return queue1.poll();
	}
}
