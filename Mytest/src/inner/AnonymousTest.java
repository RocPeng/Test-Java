package inner;

interface Product{
	public double getPrice();
	public String getName();
}

public class AnonymousTest {
//�����ڲ������
	public void test(Product p){
		System.out.println("������һ��:"+p.getName()+
				"��������"+p.getPrice());
	}
	
	public static void main(String[] args) {
		AnonymousTest ta=new AnonymousTest();
		//���ֲ��ڲ���������ڲ�����ʵľֲ���������ʹ��final����
		final int a=10;
		//����test��������ʱ����Ҫ����һ��Product����
		//��������������ʵ�����ʵ��
		ta.test(new Product() {
			@Override
			public double getPrice() {
				int x=a;
				return 567.8;
			}
			@Override
			public String getName() {
				return "AGP�Կ�";
			}
		});
	}

}
