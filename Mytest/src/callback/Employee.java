package callback;

public class Employee {
	private CallBack back;
	private String result;
	public void buySomething(CallBack back,String result){
		this.back=back;
		this.result=result;
		System.out.println(result+"���������С�����������");
		sendMessage();
	}
	
	public void sendMessage(){
		back.solve("�����Ѿ�������!");
	}
}
