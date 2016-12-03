package callback;


public class ThreadTest {
	
	public class TestThread extends Thread{
		private String str;
		public TestThread(String string){
			str=string;
		}
		@Override
		public void run() {
			System.out.println("传入Thread:"+str);
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
			System.out.println("传入Runnable:"+str);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//调用run()方法无法实现多线程，相当于还在主线程中，调用了一个普通方法
		TestThread thread=new ThreadTest().new TestThread("我曾经堕入无边黑暗");
		thread.run();
		//start()方法实现了多线程
		TestRunnable runnable=new ThreadTest().new TestRunnable("想挣扎无法自拔");
		new Thread(runnable).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}).start();
	}

}
