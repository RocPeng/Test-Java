package classtest;

public class Tuoniao extends Bird {
	{
		System.out.println("Tuoniao��ʼ����");
	}

	public String flyString = "���ߵ�����";

	public Tuoniao() {
		System.out.println("Tuoniao�޲ι��캯��");
	}

	public Tuoniao(String Str) {
		System.out.println("Tuoniao 1���ι��캯��");
	}

	public void fly() {
		System.out.println("�����ܷ�");
	}

	public void fly(String string) {
		System.out.println("���ࣺ" + string);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Tuoniao tuoniao = new Tuoniao("fff");
		// tuoniao.fly();
		// tuoniao.fly("WWW");
		// System.out.println(((Bird) tuoniao).flyString);

		 //java��̬
		A a1 = tuoniao.new A();
		A a2 = tuoniao.new B();
		B b = tuoniao.new B();
		C c = tuoniao.new C();
		D d =tuoniao.new D();
		System.out.println(a1.show(b));//A and A
		System.out.println(a1.show(c));//A and A
		System.out.println(a1.show(d));//A and D
		
		System.out.println(a2.show(b));//B and A
		System.out.println(a2.show(c));//B and A
		System.out.println(a2.show(d));//A and D
		
		System.out.println(b.show(b));//B and B
		System.out.println(b.show(c));//B and B
		System.out.println(b.show(d));//A and D
		
		System.out.println(a2.show(a2));//B and A
		System.out.println(a1.show(a2));//A and A
		System.out.println(b.show(a2));//B and A
	}

	class A {
		public String show(D obj) {
			return ("A and D");
		}

		public String show(A obj) {
			return ("A and A");
		}
	}

	class B extends A {
		public String show(B obj) {
			return ("B and B");
		}

		public String show(A obj) {
			return ("B and A");
		}
	}

	class C extends B {
	}

	class D extends B {
	}

}
