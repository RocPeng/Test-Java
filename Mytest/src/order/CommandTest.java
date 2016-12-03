package order;

import java.util.concurrent.ConcurrentHashMap;

public class CommandTest {
	// 命令模式
	private String commandTag="CommandTest";
	// 上转型对象
	// 用接口名 接口变量名= new 接口名（）｛｝；大括号里面实现接口中的方法。
	// 这就是可以看成是用的上转型对象来实现这个接口的，要记住上转型对象能调用子类重写父类的方法，
	// 其实我们是在用匿名类来继承实现接口中的方法的
	private Command command = new Command() {
		@Override
		public void process(int[] target) {
			String dsString=commandTag;
		}
	};
	//这种方法定义了Command接口的实现类
	public class commandReal implements Command{

		@Override
		public void process(int[] target) {
			String dsString=commandTag;
		}
	}
	
	public void testMethod(){
		commandReal real=new commandReal();
	}
	
	private order.AddCommand.OnClickListener clickListener=new order.AddCommand.OnClickListener() {
		
		@Override
		public void onClick() {
			
		}
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProcessArray pa = new ProcessArray();
		int[] target = { 3, -4, 6, 4 };
		// 第一次处理数组，具体处理行为取决于PrintCommand
		pa.process(target, new PrintCommand());
		System.out.println("------------------");
		// 第二次处理数组，具体行为取决于AddCommand
		pa.process(target, new AddCommand());
		//匿名内部类：对于只实现一次的时候使用
		pa.process(target,new Command() {
			@Override
			public void process(int[] target) {
				int sum = 0;
				for (int tmp : target) {
					sum += tmp;
				}
				System.out.println("数组元素的总和是:" + sum);
			}
		});
	}
}

class PrintCommand implements Command {
	public void process(int[] target) {
		for (int tmp : target) {
			System.out.println("迭代输出目标数组元素:" + tmp);
		}
	}
}

class AddCommand implements Command {
	public void process(int[] target) {
		int sum = 0;
		for (int tmp : target) {
			sum += tmp;
		}
		System.out.println("数组元素的总和是:" + sum);
	}
	public interface OnClickListener {
        void onClick();
    }
}
