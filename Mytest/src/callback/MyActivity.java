package callback;

public class MyActivity {
	//Activityʵ�ֵ���¼��Ľӿڣ���������view�ĵ���¼�
	public class Activity implements OnClickListener{
		private View view;
		public Activity(){
			view=new View();
			view.SetOnClickListener(this);
		}
		public void onclick(){
			System.out.println("view���һ��");
		}
		public void clickOnce(){
			view.performClick();
		}
	}
	//����¼��Ľӿ�
		public interface OnClickListener {
			public void onclick();
		}
	//view�࣬����ʵ���¼��ӿڵ�ʵ��������ʵ���ʱ����ýӿڷ������ش�����¼�
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
