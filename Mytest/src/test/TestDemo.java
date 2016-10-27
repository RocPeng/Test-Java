package test;

import java.util.Arrays;

import org.junit.runner.manipulation.Sortable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.mustache.Value;

public class TestDemo {
	WebDriver driver;
	String baseUrl;
	JavascriptExecutor js;

	public static void main(String args[]) {
		TestDemo demo = new TestDemo();
		// char aChar='a';
		// char enterChar='\r';
		// char u='\u9999';
		// char zhong='疯';
		// int zhongInt=zhong;
		// char c=97;
		// System.out.println(aChar);
		// System.out.println(enterChar);
		// System.out.println(u);
		// System.out.println(zhong);
		// System.out.println(zhongInt);
		// System.out.println(c);

		// long longInt=123_34_56;
		// System.out.println(longInt);
		//
		// byte b=9;
		// float f=2.1f;
		//
		String string = "Hello";
		// System.out.println(string);
		// string="rwerewr";
		// StringBuffer string2=new StringBuffer("Hello");
		// demo.test(string);
		// System.out.println(string);
		//
		// System.out.println("string2:"+string2);

		// string.replace('e', 'A');
		// System.out.println(string);

		// StringBuffer sb = new StringBuffer("Hello ");
		//
		// System.out.println("Before change, sb = " + sb);
		//
		// changeData(sb);
		//
		// System.out.println("After changeData(n), sb = " + sb);
		//
		// int a=0;
		// int b=0;
		// ++a;
		// outer:
		// for(int i=0;i<10;i++){
		// for(int j=0;j<10;j++){
		// System.out.print("i="+i+"...j="+j);
		// if (j==1) {
		// break;
		// }
		// }
		// }

		// int[] a={1,2,3};
		// int[] b=new int[4];
		// System.out.println(b.length);
		// b=a;
		// System.out.println(b.length);
		// b[0]=111;
		// System.out.println(a[0]);
		// System.out.println(b[0]);
		// System.out.println(a[1]);
		// System.out.println(b[1]);

		// intTest a=new intTest();
		// intTest b=a;
		// System.out.println(a.i);
		// System.out.println(b.i);
		// b.i=2333;
		// System.out.println(a.i);
		// System.out.println(b.i);

		// int[][] a;
		// a=new int[4][];
		// for(int i=0,len=a.length;i<len;i++){
		// System.out.println(a[i]);
		// }
		// a[0]=new int[2];
		// a[0][1]=6;
		// for(int i=0,len=a[0].length;i<len;i++){
		// System.out.println(a[0][i]);
		// }

		int[] a1 = { 3, 4, 5, 6 };
		int[] a2 = { 3, 4, 5, 6 };
		System.out.println("a1是否=a2："+Arrays.equals(a1, a2));//true
		int[] b1=Arrays.copyOf(a1, 6);
		System.out.println("a1是否=b1："+Arrays.equals(a1, b1));//false
		System.out.println("b1："+Arrays.toString(b1));//3,4,5,6,0,0
		Arrays.fill(b1, 2, 4, 1);
		System.out.println("b1赋值后："+Arrays.toString(b1));//3,4,1,1,0,0
		Arrays.sort(b1);
		System.out.println("b1排序后："+Arrays.toString(b1));//001134
	}

	public static class intTest {
		public int i = 0;
	}

	public static void changeData(StringBuffer strBuf) {

		StringBuffer sb2 = new StringBuffer("Hi ");

		strBuf = sb2;

		sb2.append("World!");

	}

	private void test(String s) {
		s = "22222";
		System.out.println("test" + s);
	}

	private void test(StringBuffer s) {
		s = new StringBuffer("11111");
	}

}
