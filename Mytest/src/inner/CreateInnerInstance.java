package inner;


class Out{
	//����һ���ڲ��࣬����ͬ���ʿ��Ʒ�
	//��ֻ��ͬһ�����е���������Է��ʸ��ڲ���
	class In{
		public In(String msg){
			System.out.println(msg);
		}
	}
}

public class CreateInnerInstance {

	public static void main(String[] args) {
		Out.In in=new Out().new In("������Ϣ");
		//����Ҳ��
		Out out=new Out();
		Out.In in2;
		in2=out.new In("������Ϣ");
	}

}
