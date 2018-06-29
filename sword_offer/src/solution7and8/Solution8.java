package solution7and8;

public class Solution8 {
	public static Node getNext(Node root){
		if(root==null) 
			return null;
        if(root.getRightNode()!=null){    //如果有右子树，则找右子树的最左节点
        	root = root.getRightNode();
            while(root!=null&&root.getLeftNode()!=null){
            	root = root.getLeftNode();
            }
            return root;
        }
        while(root.getFather()!=null){ //没右子树，则找第一个当前节点是父节点左孩子的节点
            if(root.getFather().getLeftNode()==root) 
            	return root.getFather();
            root = root.getFather();
        }
        return null;   //退到了根节点仍没找到，则返回null
	}

	
}
