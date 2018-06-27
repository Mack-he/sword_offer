package solution4;

public class FindinArray {
	/**
	 * 二维数组中的查找 题目：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排列
	 * 请完成一个函数，输入一个这样的二维数组和一个整数，判断数组中是否含有该整数。
	 * 
	 * @param array
	 * @return
	 */
	public static boolean isFind(int[][] array, int target) {
		boolean find = false;
		int row = 0;// 行
		int col = array[0].length - 1;// 列
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
