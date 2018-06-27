package solution2;

/**
 * ���������ʵ��Singletonģʽ
 * ���һ���࣬����ֻ���������һ��ʵ��
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
