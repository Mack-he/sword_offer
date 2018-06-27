package solution3;

public class DuplicationInArray {

	/**
	 * ��Ŀһ���ҳ��������ظ�����
	 * ��һ������Ϊn����������������ֶ���0--n-1�ķ�Χ�ڡ������е�ĳЩ�������ظ��ģ����ǲ�֪��
	 * �м����������ظ��ģ�Ҳ��֪��ÿ�������ظ��˼��Ρ����ҳ�����������һ���ظ������֡�
	 * ���磺������볤��Ϊ7������{2,3,1,0,2,5,6}����ô�ظ������־���2.
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
	 * ��Ŀ�������޸������ҳ��ظ������֡�
	 * ��һ������Ϊn+1�������������е����ֶ���1~n�ķ�Χ�ڣ�����������������һ���������ظ��ã�
	 * ���ҳ�����������һ���ظ������֣��������޸���������顣���磬������볤����8������
	 * {2,3,5,4,3,2,6,7}����ô��Ӧ���ظ����־���2����3.
	 * �ⷨһ�������ڶ��ֲ��ң���1~n�����ִ��м������m�ֳ������֣�ǰ��Ϊ1~m�����Ϊm+1~n�����
	 * 1-m�����ֳ���m����ô��һ��һ�������ظ����֣�������һ������ظ�����
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
	 * �ⷨ2�������������飬���������е����������ּ����ɷŵ����������У���֮ǰ����
	 * �жϸ����������Ƿ���ֵ������Ѿ���ֵ�������ֵΪ�ظ�����
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
