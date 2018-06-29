package solution7and8;

import java.util.Arrays;
/**
 * 面试题7：重建二叉树
 * 题目：输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不包含重复的数字，
 * 例如，前序遍历的序列为：{1,2,4,7,3,5,6,8}，中序遍历的数字为{4,7,2,1,5,3,8,6}
 * 思路解析：
 * 前序遍历的第一个肯定是根节点，中序遍历的根节点一点在中间，所以根据根节点把数组分隔开，根节点左边是左子树，右边为右子树，
 * 使用递归即可解决。
 * 
 * Arrays.copyOfRange(firstOrder, 1, i+1)
 * 第一个值为数组，第二个为新数组的起始位置，包含其值，第三个为新数组的结束位置，不包含其值。
 * @author Administrator
 *
 */
public class ReStructBTree {
	public static Node reStructTree(int[] firstOrder,int[] middleOrder){
		if (firstOrder == null || middleOrder == null) {
			return null;
		}
		if (firstOrder.length == 0 || middleOrder.length == 0) {
			return null;
		}
		if (firstOrder.length != middleOrder.length) {
			return null;
		}
		Node root = new Node(firstOrder[0]);
		for (int i = 0; i < middleOrder.length; i++) {
			if (firstOrder[0] == middleOrder[i]) {
				root.setLeftNode(reStructTree(Arrays.copyOfRange(firstOrder, 1, i+1),
						Arrays.copyOfRange(middleOrder, 0, i)));
				root.setRightNode(reStructTree(Arrays.copyOfRange(firstOrder, i+1, firstOrder.length), 
						Arrays.copyOfRange(middleOrder, i+1, middleOrder.length)));
			}
		}
		return root;
	}

}
