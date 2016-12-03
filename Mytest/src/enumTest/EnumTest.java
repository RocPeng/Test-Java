package enumTest;

import org.omg.CORBA.PUBLIC_MEMBER;

public class EnumTest {

	public void judge(SeasonEnum s){
		switch (s) {
		case SPRING:
			System.out.println("��ů����");
			break;
		case SUMMER:
			System.out.println("��������");
			break;
		case FALL:
			System.out.println("�����ˬ");
			break;
		case WINTER:
			System.out.println("����Ʈѩ");
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		//ö�����Ĭ��values�������������ظ�ö���������ʵ��
		for(SeasonEnum s:SeasonEnum.values()){
			System.out.println(s);
		}
		//ʹ��ö��ʵ��ʱ������ͨ��EnumClass.variable��ʽ����
		new EnumTest().judge(SeasonEnum.WINTER);
		System.out.println("-----Gender------");
		Gender g=Enum.valueOf(Gender.class, "FEMALE");
		//ֱ��Ϊö��ֵ��nameʵ��������ֵ
		g.name="Ů";
		//ֱ�ӷ���ö��ֵ��nameʵ������
		System.out.println(g+"����:"+g.name);
		System.out.println("-----GenderFormal------");
		GenderFormal gf=GenderFormal.valueOf("FEMALE");
		gf.setName("Ů");
		System.out.println(g+"����:"+gf.getName());
		gf.setName("��");
		System.out.println(g+"����:"+gf.getName());
		System.out.println("-----GenderImmu------");
		System.out.println(GenderImmu.FEMALE.getName());
		System.out.println("-----GenderSub2------");
		GenderSub2.FEMALE.info();
		System.out.println("-----Operation PLUS------");
		System.out.println(Operation.PLUS.eval(2.2,3.3));
	}

}

enum SeasonEnum{
	//4��ö��ʵ��
	SPRING,SUMMER,FALL,WINTER;
}

enum Gender{
	MALE,FEMALE;
	//����һ��publicʵ������
	public String name;
}
//��Ա�����ɱ��ö����
enum GenderFormal{
	MALE,FEMALE;
	private String name;
	public void setName(String name){
		switch (this) {
		case MALE:
			if(name.equals("��")){
				this.name=name;
			}else {
				System.out.println("��������");
				return;
			}
			break;
		case FEMALE:
			if(name.equals("Ů")){
				this.name=name;
			}else {
				System.out.println("��������");
				return;
			}
			break;
		default:
			break;
		}
	}
	public String getName(){
		return this.name;
	}
}
//ö����ͨ������Ƴɲ��ɱ��࣬���£�
enum GenderImmu{
	MALE("��"),FEMALE("Ů");
	private final String name;
	//ö����Ĺ�����ֻ����private����
	private GenderImmu(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
}
//ʵ�ֽӿڵ�ö����(ö��ֵӵ����ͬ��infoʵ��)
interface GenderDesc{
	void info();
}
enum GenderSub implements GenderDesc{
	MALE("��"),FEMALE("Ů");
	private final String name;
	//ö����Ĺ�����ֻ����private����
	private GenderSub(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void info(){
		System.out.println("����һ�������Ա��ö����");
	}
}
//ʵ�ֽӿڵ�ö����(ö��ֵӵ�в�ͬ��infoʵ��)
enum GenderSub2 implements GenderDesc{
	//ö����������ڲ���
	MALE("��"){
		public void info(){
			System.out.println("���ö��ֵ������");
		}
	},
	FEMALE("Ů"){
		public void info(){
			System.out.println("���ö��ֵ��Ů��");
		}
	};
	private final String name;
	//ö����Ĺ�����ֻ����private����
	private GenderSub2(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
}
//�������󷽷���ö����
enum Operation{
	PLUS{
		public double eval(double x,double y){
			return x+y;
		}
	},
	MINUS{
		public double eval(double x,double y){
			return x-y;
		}
	},
	TIMES{
		public double eval(double x,double y){
			return x*y;
		}
	},
	DIVIDE{
		public double eval(double x,double y){
			return x/y;
		}
	};
	//Ϊö���ඨ��һ�����󷽷�
	//������󷽷��ɲ�ͬ��ö��ֵ�ṩ��ͬ��ʵ��
	public abstract double eval(double x,double y);
}