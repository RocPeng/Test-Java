package enumTest;

import org.omg.CORBA.PUBLIC_MEMBER;

public class EnumTest {

	public void judge(SeasonEnum s){
		switch (s) {
		case SPRING:
			System.out.println("春暖花开");
			break;
		case SUMMER:
			System.out.println("夏日炎炎");
			break;
		case FALL:
			System.out.println("秋高气爽");
			break;
		case WINTER:
			System.out.println("冬日飘雪");
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		//枚举类的默认values（）方法，返回该枚举类的所有实例
		for(SeasonEnum s:SeasonEnum.values()){
			System.out.println(s);
		}
		//使用枚举实例时，可以通过EnumClass.variable形式访问
		new EnumTest().judge(SeasonEnum.WINTER);
		System.out.println("-----Gender------");
		Gender g=Enum.valueOf(Gender.class, "FEMALE");
		//直接为枚举值的name实例变量赋值
		g.name="女";
		//直接访问枚举值的name实例变量
		System.out.println(g+"代表:"+g.name);
		System.out.println("-----GenderFormal------");
		GenderFormal gf=GenderFormal.valueOf("FEMALE");
		gf.setName("女");
		System.out.println(g+"代表:"+gf.getName());
		gf.setName("男");
		System.out.println(g+"代表:"+gf.getName());
		System.out.println("-----GenderImmu------");
		System.out.println(GenderImmu.FEMALE.getName());
		System.out.println("-----GenderSub2------");
		GenderSub2.FEMALE.info();
		System.out.println("-----Operation PLUS------");
		System.out.println(Operation.PLUS.eval(2.2,3.3));
	}

}

enum SeasonEnum{
	//4个枚举实例
	SPRING,SUMMER,FALL,WINTER;
}

enum Gender{
	MALE,FEMALE;
	//定义一个public实例变量
	public String name;
}
//成员变量可变的枚举类
enum GenderFormal{
	MALE,FEMALE;
	private String name;
	public void setName(String name){
		switch (this) {
		case MALE:
			if(name.equals("男")){
				this.name=name;
			}else {
				System.out.println("参数错误");
				return;
			}
			break;
		case FEMALE:
			if(name.equals("女")){
				this.name=name;
			}else {
				System.out.println("参数错误");
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
//枚举类通常被设计成不可变类，如下：
enum GenderImmu{
	MALE("男"),FEMALE("女");
	private final String name;
	//枚举类的构造器只能用private修饰
	private GenderImmu(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
}
//实现接口的枚举类(枚举值拥有相同的info实现)
interface GenderDesc{
	void info();
}
enum GenderSub implements GenderDesc{
	MALE("男"),FEMALE("女");
	private final String name;
	//枚举类的构造器只能用private修饰
	private GenderSub(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void info(){
		System.out.println("这是一个定义性别的枚举类");
	}
}
//实现接口的枚举类(枚举值拥有不同的info实现)
enum GenderSub2 implements GenderDesc{
	//枚举类的匿名内部类
	MALE("男"){
		public void info(){
			System.out.println("这个枚举值是男性");
		}
	},
	FEMALE("女"){
		public void info(){
			System.out.println("这个枚举值是女性");
		}
	};
	private final String name;
	//枚举类的构造器只能用private修饰
	private GenderSub2(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
}
//包含抽象方法的枚举类
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
	//为枚举类定义一个抽象方法
	//这个抽象方法由不同的枚举值提供不同的实现
	public abstract double eval(double x,double y);
}