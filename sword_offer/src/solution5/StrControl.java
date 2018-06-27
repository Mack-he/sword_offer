package solution5;

public class StrControl {
	/**
	 * 替换空格
	 * 题目：请实现一个函数，把字符串中的每个空格替换成“%20”，例如
	 * 输入“we are happy”，则输出“we%20are%20happy”.
	 */
	public static String replaceBlank(String str){
		if (str == null || str.length()<=0) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				sb.append(str.charAt(i));
			}else {
				sb.append("%20");
			}
		}
		return sb.toString();
	}
    /**
     * 相關題目：有两个排序的数组A1和A2，请实现一个函数，把A1和A2合并成一个排序数组。
     * 解题思路：1、新建一个辅助数组，长度为A1+A2，把A1和A2中的所有数字先全部放入到辅助数组，然后再进行排序
     * @param arr
     * @param brr
     * @return
     */
	public static int[] mergeStr1(int[] arr,int[] brr){
		int arrLength = arr.length;
		int brrLength = brr.length;
		int[] crr = new int[arrLength+brrLength];
		if (arr==null || arr.length<=0) {
			return brr;
		}else if (brr==null || brr.length<=0) {
			return arr;
		}else if ((arr==null || arr.length<=0) || (brr==null || brr.length<=0)) {
			return crr;
		}
		for (int i = 0; i < crr.length; i++) {
			if (i<arrLength) {
				crr[i] = arr[i];
			}else {
				crr[i] = brr[i-arrLength];
			}
		}
		for (int i = 0; i < crr.length; i++) {
			for (int j = i+1; j < crr.length; j++) {
				if (crr[i]>crr[j]) {
					int tmp = crr[i];
					crr[i] = crr[j];
					crr[j] = tmp;
				}
			}
		}
		return crr;
	}
	/**
	 * 解法思路2：直接先比较两个数组的值，然后塞入辅助数组
	 * @param arr
	 * @param brr
	 * @return
	 */
	public static int[] mergeStr2(int[] arr,int[] brr){
		int arrLength = arr.length;
		int brrLength = brr.length;
		int[] crr = new int[arrLength+brrLength];
		if (arr==null || arr.length<=0) {
			return brr;
		}else if (brr==null || brr.length<=0) {
			return arr;
		}else if ((arr==null || arr.length<=0) || (brr==null || brr.length<=0)) {
			return crr;
		}
		int i=0,k=0,j=0;
		while(i<arrLength && j <brrLength){
			if (arr[i] <= brr[j]) {
				crr[k++] = arr[i++];
			}else {
				crr[k++] = brr[j++];
			}
		}
		while(i<arrLength){
			crr[k++] = arr[i++];
		}
		while(j<brrLength){
			crr[k++] = brr[j++];
		}
		return crr;
	}
	
}
