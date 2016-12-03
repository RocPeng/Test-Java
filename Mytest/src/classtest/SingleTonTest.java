package classtest;


class SingleTon {
	private static SingleTon instance;

	private SingleTon() {
	}

	public static SingleTon getInstance() {
		if (instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}
}

abstract class subClass {
	public void TTest() {
	}

	abstract int abstractInt();

	public static void staticMethod() {
		System.out.println("Sub Static Method");
	}
}

public abstract class SingleTonTest extends subClass {
	public static void main(String[] argStrings) {
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		System.out.println("单例是否相同:" + (s1 == s2));
	}

	public void test(final int a) {
		// a=2;
	}

	public void TTest() {
		super.TTest();
	}

	public static void staticMethod() {
	}
}
