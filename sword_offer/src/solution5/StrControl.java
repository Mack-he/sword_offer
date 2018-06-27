package solution5;

public class StrControl {
	/**
	 * �滻�ո�
	 * ��Ŀ����ʵ��һ�����������ַ����е�ÿ���ո��滻�ɡ�%20��������
	 * ���롰we are happy�����������we%20are%20happy��.
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
     * ���P�}Ŀ�����������������A1��A2����ʵ��һ����������A1��A2�ϲ���һ���������顣
     * ����˼·��1���½�һ���������飬����ΪA1+A2����A1��A2�е�����������ȫ�����뵽�������飬Ȼ���ٽ�������
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
	 * �ⷨ˼·2��ֱ���ȱȽ����������ֵ��Ȼ�����븨������
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
