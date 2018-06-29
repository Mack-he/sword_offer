package solution7and8;


public class Test {
	 //先建立子节点，再建立父节点
    public static Node init(){
    	Node D = new Node(4,null,null);
        Node E = new Node(8,null,null);
        Node F = new Node(12,null,null);
        Node G = new Node(16,null,null);
        Node C = new Node(14,F,G);
        Node B = new Node(6,D,E);
        Node A = new Node(10, B, C);
        return A;   //返回根节点
    }
    public static void main(String[] args) {
		Node node = init();
		
		//使用递归
//		System.out.print("先序遍历：");
//		RecursionBinaryTree.FirstOrder(node);
//		System.out.println();
//		System.out.print("中序遍历：");
//		RecursionBinaryTree.MiddleOrder(node);
//		System.out.println();
//		System.out.print("后序遍历：");
//		RecursionBinaryTree.PostOrder(node);
		
		
		//使用栈
//		StackBinaryTree.FirstOrder(node);
//		System.out.println();
//		StackBinaryTree.MiddleOrder(node);
//		System.out.println();
//		StackBinaryTree.PostOrder(node);
//		System.out.println();
//		StackBinaryTree.BFS_Order(node);
		
		//根据前序和中序构建二叉树
//		int [] a = {1,2,4,7,3,5,6,8};
//		int[] b = {4,7,2,1,5,3,8,6};
//		Node root = ReStructBTree.reStructTree(a, b);
//		System.out.println(root.getData()+"->"+root.getLeftNode().getLeftNode().getData()+"->"+root.getRightNode().getData());
      
		Node l = Solution8.getNext(node);
		System.out.println(l.getData());
	}
}
