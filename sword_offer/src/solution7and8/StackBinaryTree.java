package solution7and8;

import java.util.ArrayDeque;
import java.util.Stack;

/**
 * �����õݹ飬����ջѭ��
 * 
 * @author Administrator
 * 
 */
public class StackBinaryTree {
	public static void printNode(Node node) {
		System.out.print(node.getData() + " ");
	}
	/**
	 * ���������������������
	 * 
	 * @param root
	 */
	public static void FirstOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		// �жϽڵ��Ƿ�Ϊ�ջ���ջ���Ƿ�Ϊ�գ�����Ϊ��ʱ������ѭ��
		while (root != null || stack.size() > 0) {
			if (root != null) {
				printNode(root);
				stack.push(root);
				root = root.getLeftNode();
			} else {
				root = stack.pop();
				root = root.getRightNode();
			}
		}
	}

	/**
	 * ��������������������
	 * 
	 * @param root
	 */
	public static void MiddleOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		// �жϽڵ��Ƿ�Ϊ�ջ���ջ���Ƿ�Ϊ�գ�����Ϊ��ʱ������ѭ��
		while (root != null || stack.size() > 0) {
			if (root != null) {
				stack.push(root);
				root = root.getLeftNode();
			} else {
				root = stack.pop();
				printNode(root);
				root = root.getRightNode();
			}
		}
	}

	/**
	 * ������������������Ҹ�
	 * 
	 * @param root
	 */
	public static void PostOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		Stack<Node> output = new Stack<>();// �������ջ
		// �жϽڵ��Ƿ�Ϊ�ջ���ջ���Ƿ�Ϊ�գ�����Ϊ��ʱ������ѭ��
		while (root != null || stack.size() > 0) {
			if (root != null) {
				output.push(root);
				stack.push(root);
				root = root.getRightNode();
			} else {
				root = stack.pop();
				root = root.getLeftNode();

			}
		}
		while (output.size() > 0) {
			printNode(output.pop());
		}
	}

	/**
	 * ʹ�ø������У�ʵ�ֶ������Ĺ�����ȱ���
	 * @param root
	 */
	public static void BFS_Order(Node root) {
		ArrayDeque<Node> queue = new ArrayDeque<>();
		queue.add(root);
		while (queue.isEmpty() == false) {
			Node node = queue.remove();
			printNode(node);
			if (node.getLeftNode() != null) {
				queue.add(node.getLeftNode());
			}
			if (node.getRightNode() != null) {
				queue.add(node.getRightNode());
			}
		}

	}
}
