package classtest;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//静态变量被所有对象共享
		StaticTest testA=new StaticTest();
		StaticTest testB=new StaticTest();
		System.out.println(testA.value);
		System.out.println(testB.value);
		testA.value=2333;
		System.out.println(testA.value);
		System.out.println(testB.value);
		//非静态方法调用
		testA.hit();
		new StaticTest().hit();
		//静态方法调用（推荐1 直接类名调用）
		StaticTest.hitStatic();
		new StaticTest().hitStatic();
		
		StaticTest test=new StaticTest();
		System.out.println("交换前a=："+test.a+"  b="+test.b);
		swap(test);
		System.out.println("交换后a=："+test.a+"  b="+test.b);
		
		StaticTest.test(20, "aa","bbb","hahah");
		
		System.out.println(digui(10));
		
	}
	
	public static void swap(StaticTest test){
		//传入的test和方法中的test是两个变量，不过指向同一内存
		int temp=test.a;
		test.a=test.b;
		test.b=temp;
		test=null;
	}
	
	//递归方法：f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n)
	public static int digui(int i){
		if (i==0) {
			return 1;
		}else if (i==1) {
			return 4;
		}else {
			return 2*digui(i-1)+digui(i-2);
		}
	}

}
