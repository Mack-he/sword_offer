package solution2;

/**
 * 面试题二：实现Singleton模式
 * 设计一个类，我们只能生成类的一个实例
 * @author Administrator
 *
 */
public class Singleton {

	private static class SingletonInstance{
		private static final Singleton instance = new Singleton();
	}
	public static Singleton getInstance(){
		return SingletonInstance.instance;
		}
	public Singleton(){}
	}
