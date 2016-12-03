package callback;

public class Boss implements CallBack{
	private Employee wang;
	
	public Boss(Employee wang){
		this.wang=wang;
	}
	
	public void buy(){
		wang.buySomething(this, "帮我解决!");
	}
	
	public void solve(String str){
		System.out.println("结果是:"+str);
	}

}
