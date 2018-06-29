package solution9;

public class Test {
    public static void main(String[] args) throws Exception {
    	//测试两个栈实现队列
//		MQueue.push(1);
//		MQueue.push(2);
//		MQueue.push(3);
//		System.out.println(MQueue.pop());
//		System.out.println(MQueue.pop());
//		MQueue.push(4);
//		System.out.println(MQueue.pop());
//		System.out.println(MQueue.pop());
    	
    	//测试两个队列实现栈
    	MStack.push(1);
    	MStack.push(2);
    	MStack.push(3);
    	System.out.println(MStack.pop());
    	System.out.println(MStack.pop());
    	MStack.push(4);
    	System.out.println(MStack.pop());
    	System.out.println(MStack.pop());
	}
}
