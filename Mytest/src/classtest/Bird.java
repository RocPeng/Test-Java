package classtest;

public class Bird {
	{
		System.out.println("Bird初始化块");
	}
	
	public String flyString="飞鸟";
	public void fly(){
		System.out.println("可以在天上飞的鸟!");
	}

	public Bird() {
		System.out.println("Bird构造函数!");
	}
}
