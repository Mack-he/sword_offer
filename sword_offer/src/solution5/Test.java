package solution5;

public class Test {

	public static void main(String[] args) {
//		String str = "we are happy";
//		System.out.println(StrControl.replaceBlank(str));
		int [] A1 = {1,3,5,7,9,10};
		int []A2 = {1,2,3,4,5,6,7,7};
		int[] A = StrControl.mergeStr1(A1, A2);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+" ");
		}
	}
}
