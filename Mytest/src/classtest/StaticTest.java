package classtest;

import test.TestDemo.intTest;


public class StaticTest {
	public StaticTest() {
	}

	public static int value = 10;
	int a=1;
	int b=233;

	public void hit() {

	}

	public static void hitStatic() {

	}
	//�βθ����ɱ�
	public static void test(int a,String...strings){
		for (String str:strings) {
			System.out.println(str);
		}
	}
	
}
