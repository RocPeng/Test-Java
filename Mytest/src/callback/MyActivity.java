package callback;

public class MyActivity {
	//Activity实现点击事件的接口，用来接收view的点击事件
	public class Activity implements OnClickListener{
		private View view;
		public Activity(){
			view=new View();
			view.SetOnClickListener(this);
		}
		public void onclick(){
			System.out.println("view点击一次");
		}
		public void clickOnce(){
			view.performClick();
		}
	}
	//点击事件的接口
		public interface OnClickListener {
			public void onclick();
		}
	//view类，保存实现事件接口的实体对象，在适当的时候调用接口方法，回传点击事件
	public class View{
		private  OnClickListener listener;
		public void performClick(){
			listener.onclick();
		}
		public void SetOnClickListener(OnClickListener l){
			listener=l;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Activity activity=new MyActivity().new Activity();
		activity.clickOnce();
	}

}
