package callback;

public class Employee {
	private CallBack back;
	private String result;
	public void buySomething(CallBack back,String result){
		this.back=back;
		this.result=result;
		System.out.println(result+"正在买东西中——————");
		sendMessage();
	}
	
	public void sendMessage(){
		back.solve("东西已经买完了!");
	}
}
