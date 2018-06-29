package solution7and8;
/**
 * �ݹ����������
 * @author Administrator
 *
 */
public class RecursionBinaryTree {

	public static void printNode(Node node){
		System.out.print(node.getData()+" ");
	}
	/**
	 * ���������������������
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
	 * ��������������������
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
	 * ������������������Ҹ�
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
