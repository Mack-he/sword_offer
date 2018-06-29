package solution9;

import java.util.ArrayDeque;
/**
 * 两个队列实现一个栈
 * 思路：每次在队列一中都留下最后一个进入的元素，其余存进队列2，然后队列2再进入队列1，刚才队列1的最后一个元素就变成了队首元素
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
