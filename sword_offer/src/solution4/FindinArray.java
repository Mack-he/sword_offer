package solution4;

public class FindinArray {
	/**
	 * ��ά�����еĲ��� ��Ŀ����һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
	 * �����һ������������һ�������Ķ�ά�����һ���������ж��������Ƿ��и�������
	 * 
	 * @param array
	 * @return
	 */
	public static boolean isFind(int[][] array, int target) {
		boolean find = false;
		int row = 0;// ��
		int col = array[0].length - 1;// ��
		while (col > 0 && row < array.length) {
			int num = array[row][col];
			if (num == target) {
				find = true;
				break;
			} else if (num > target) {
				col--;
			} else {
				row++;
			}
		}
		return find;
	}

}
