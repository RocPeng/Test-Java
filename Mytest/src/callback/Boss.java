package callback;

public class Boss implements CallBack{
	private Employee wang;
	
	public Boss(Employee wang){
		this.wang=wang;
	}
	
	public void buy(){
		wang.buySomething(this, "���ҽ��!");
	}
	
	public void solve(String str){
		System.out.println("�����:"+str);
	}

}
