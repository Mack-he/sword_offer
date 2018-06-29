package solution7and8;

import java.util.Arrays;
/**
 * ������7���ؽ�������
 * ��Ŀ������ĳ��������ǰ���������������Ľ�������ؽ��ö�������
 * ���������ǰ���������������Ľ���ж��������ظ������֣�
 * ���磬ǰ�����������Ϊ��{1,2,4,7,3,5,6,8}���������������Ϊ{4,7,2,1,5,3,8,6}
 * ˼·������
 * ǰ������ĵ�һ���϶��Ǹ��ڵ㣬��������ĸ��ڵ�һ�����м䣬���Ը��ݸ��ڵ������ָ��������ڵ���������������ұ�Ϊ��������
 * ʹ�õݹ鼴�ɽ����
 * 
 * Arrays.copyOfRange(firstOrder, 1, i+1)
 * ��һ��ֵΪ���飬�ڶ���Ϊ���������ʼλ�ã�������ֵ��������Ϊ������Ľ���λ�ã���������ֵ��
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
