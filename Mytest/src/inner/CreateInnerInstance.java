package inner;


class Out{
	//定义一个内部类，不是同访问控制符
	//即只有同一个包中的其他类可以访问该内部类
	class In{
		public In(String msg){
			System.out.println(msg);
		}
	}
}

public class CreateInnerInstance {

	public static void main(String[] args) {
		Out.In in=new Out().new In("测试信息");
		//以下也行
		Out out=new Out();
		Out.In in2;
		in2=out.new In("测试信息");
	}

}
