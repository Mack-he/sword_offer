package solution7and8;

import java.util.ArrayDeque;
import java.util.Stack;

/**
 * 不采用递归，借用栈循环
 * 
 * @author Administrator
 * 
 */
public class StackBinaryTree {
	public static void printNode(Node node) {
		System.out.print(node.getData() + " ");
	}
	/**
	 * 先序遍历二叉树：根左右
	 * 
	 * @param root
	 */
	public static void FirstOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		// 判断节点是否为空或者栈中是否为空，当均为空时，结束循环
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
	 * 中序遍历二叉树：左根右
	 * 
	 * @param root
	 */
	public static void MiddleOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		// 判断节点是否为空或者栈中是否为空，当均为空时，结束循环
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
	 * 后序遍历二叉树：左右根
	 * 
	 * @param root
	 */
	public static void PostOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		Stack<Node> output = new Stack<>();// 辅助输出栈
		// 判断节点是否为空或者栈中是否为空，当均为空时，结束循环
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
	 * 使用辅助队列，实现二叉树的广度优先遍历
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
