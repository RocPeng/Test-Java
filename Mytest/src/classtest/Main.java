package classtest;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��̬���������ж�����
		StaticTest testA=new StaticTest();
		StaticTest testB=new StaticTest();
		System.out.println(testA.value);
		System.out.println(testB.value);
		testA.value=2333;
		System.out.println(testA.value);
		System.out.println(testB.value);
		//�Ǿ�̬��������
		testA.hit();
		new StaticTest().hit();
		//��̬�������ã��Ƽ�1 ֱ���������ã�
		StaticTest.hitStatic();
		new StaticTest().hitStatic();
		
		StaticTest test=new StaticTest();
		System.out.println("����ǰa=��"+test.a+"  b="+test.b);
		swap(test);
		System.out.println("������a=��"+test.a+"  b="+test.b);
		
		StaticTest.test(20, "aa","bbb","hahah");
		
		System.out.println(digui(10));
		
	}
	
	public static void swap(StaticTest test){
		//�����test�ͷ����е�test����������������ָ��ͬһ�ڴ�
		int temp=test.a;
		test.a=test.b;
		test.b=temp;
		test=null;
	}
	
	//�ݹ鷽����f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n)
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
