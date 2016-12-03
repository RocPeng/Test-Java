package inner;

interface Product{
	public double getPrice();
	public String getName();
}

public class AnonymousTest {
//匿名内部类测试
	public void test(Product p){
		System.out.println("购买了一个:"+p.getName()+
				"，花掉了"+p.getPrice());
	}
	
	public static void main(String[] args) {
		AnonymousTest ta=new AnonymousTest();
		//被局部内部类和匿名内部类访问的局部变量必须使用final修饰
		final int a=10;
		//调用test（）方法时，需要传入一个Product参数
		//次数传入其匿名实现类的实例
		ta.test(new Product() {
			@Override
			public double getPrice() {
				int x=a;
				return 567.8;
			}
			@Override
			public String getName() {
				return "AGP显卡";
			}
		});
	}

}
