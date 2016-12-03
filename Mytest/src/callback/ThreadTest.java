package callback;


public class ThreadTest {
	
	public class TestThread extends Thread{
		private String str;
		public TestThread(String string){
			str=string;
		}
		@Override
		public void run() {
			System.out.println("����Thread:"+str);
			super.run();
		}
		public void yy(){
			
		}
	}
	
	public class TestRunnable implements Runnable{
		String str;
		public TestRunnable(String string){
			str=string;
		}
		@Override
		public void run() {
			System.out.println("����Runnable:"+str);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����run()�����޷�ʵ�ֶ��̣߳��൱�ڻ������߳��У�������һ����ͨ����
		TestThread thread=new ThreadTest().new TestThread("�����������ޱߺڰ�");
		thread.run();
		//start()����ʵ���˶��߳�
		TestRunnable runnable=new ThreadTest().new TestRunnable("�������޷��԰�");
		new Thread(runnable).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}).start();
	}

}
