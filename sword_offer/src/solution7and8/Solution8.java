package solution7and8;

public class Solution8 {
	public static Node getNext(Node root){
		if(root==null) 
			return null;
        if(root.getRightNode()!=null){    //�����������������������������ڵ�
        	root = root.getRightNode();
            while(root!=null&&root.getLeftNode()!=null){
            	root = root.getLeftNode();
            }
            return root;
        }
        while(root.getFather()!=null){ //û�����������ҵ�һ����ǰ�ڵ��Ǹ��ڵ����ӵĽڵ�
            if(root.getFather().getLeftNode()==root) 
            	return root.getFather();
            root = root.getFather();
        }
        return null;   //�˵��˸��ڵ���û�ҵ����򷵻�null
	}

	
}
