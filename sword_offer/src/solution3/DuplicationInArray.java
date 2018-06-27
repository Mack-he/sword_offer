package solution3;

public class DuplicationInArray {

	/**
	 * 题目一：找出数组中重复的数
	 * 在一个长度为n的数组里的所有数字都在0--n-1的范围内。数组中的某些数字是重复的，但是不知道
	 * 有几个数字是重复的，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
	 * 例如：如果输入长度为7的数组{2,3,1,0,2,5,6}，那么重复的数字就是2.
	 * @param array
	 * @return
	 */
	public static int duplication(int []array){
		if (array == null || array.length <= 0) {
			return -1;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0 || array[i] > array.length-1) {
				return -1;
			}
		}
		for (int i = 0; i < array.length; i++) {
			while (array[i] != i) {
				if (array[array[i]] == array[i]) {
					return array[i];
				}else {
					int temp = array[i];
					array[i] = array[temp];
					array[temp] = temp;
				}
				
			}
		}
		return -1;
	}
	/**
	 * 题目二：不修改数组找出重复的数字。
	 * 在一个长度为n+1的数组里面所有的数字都在1~n的范围内，所以数组中至少有一个数字是重复得，
	 * 请找出数组中任意一个重复的数字，但不能修改输入的数组。例如，如果输入长度是8的数组
	 * {2,3,5,4,3,2,6,7}，那么对应的重复数字就是2或者3.
	 * 解法一：类似于二分查找，把1~n的数字从中间的数字m分成两部分，前面为1~m，后边为m+1~n，如果
	 * 1-m的数字超过m，那么这一半一定包含重复数字，否则，另一半包括重复数字
	 * @param array
	 * @return
	 */
	public static int getDuplication1(int [] array){
		if (array == null || array.length <= 0) {
			return -1;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 1 || array[i] > array.length-1) {
				return -1;
			}
		}
		int start = 1;
		int end = array.length-1;
		while(end >= start){
			int middle = ( end - start)/2 + start;
			int count = getcount(array,start,middle);
			//System.out.println(count);
			if (end == start) {
				if (count>1) {
					return start;
				}else {
					break;
				}
			}
			if (count>middle-start+1) {
				end = middle;
			}else {
				start = middle+1;
			}
		}
		return -1;
	}
	/**
	 * 解法2：借助辅助数组，遍历数组中的数，是数字几即可放到辅助数组中，放之前首先
	 * 判断辅助数组中是否有值，如果已经有值，既这个值为重复数字
	 * @param array
	 * @return
	 */
	public static int getDuplication2(int [] array){
		if (array == null || array.length <= 0) {
			return -1;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 1 || array[i] > array.length-1) {
				return -1;
			}
		}
		int [] brr = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (brr[array[i]]!=0) {
				return array[i];
			}else {
				brr[array[i]] = array[i];
			}
		}
		return -1;
	}
	private static int getcount(int[] array, int start, int end) {
		int count =0 ;
		for (int i = 0; i < array.length; i++) {
			if (array[i]>=start && array[i] <= end) {
				count++;
			}
		}
		return count;
	}
}
