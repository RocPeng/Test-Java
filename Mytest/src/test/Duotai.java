package test;

import test.TestDemo.intTest;

public class Duotai {
	
	class A{
		int i=7;
		void m1(){
			System.out.println("A m1");
		}
		void m2(){
			System.out.println("A m2");
		}
		void m3(){
			System.out.println("A m3");
		}
	}
	
	class B extends A{
		void m1(){
			System.out.println("B m1");
		}
	}
	
	class C extends B{
		void m3(){
			System.out.println("C m3"+(i+6));
		}
		void mc(){
			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a2=new Duotai().new C();
		a2.m1();
		a2.m2();
		a2.m3();
		//a2.mc();//无法调用
	}

}
