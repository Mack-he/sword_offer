package solution7and8;
/**
 * 递归遍历二叉树
 * @author Administrator
 *
 */
public class RecursionBinaryTree {

	public static void printNode(Node node){
		System.out.print(node.getData()+" ");
	}
	/**
	 * 先序遍历二叉树：根左右
	 * @param root
	 */
	public static void FirstOrder(Node root){
		printNode(root);
		if (root.getLeftNode()!=null) {
			FirstOrder(root.getLeftNode());
		}
		if (root.getRightNode()!=null) {
			FirstOrder(root.getRightNode());
		}
	}
	/**
	 * 中序遍历二叉树：左根右
	 * @param root
	 */
	public static void MiddleOrder(Node root){
		if (root.getLeftNode()!=null) {
			MiddleOrder(root.getLeftNode());
		}
		printNode(root);
		if (root.getRightNode()!=null) {
			MiddleOrder(root.getRightNode());
		}
	}
	/**
	 * 后序遍历二叉树：左右根
	 * @param root
	 */
	public static void PostOrder(Node root){
		if (root.getLeftNode()!=null) {
			PostOrder(root.getLeftNode());
		}
		if (root.getRightNode()!=null) {
			PostOrder(root.getRightNode());
		}
		printNode(root);
	}
}
