package order;

import java.util.concurrent.ConcurrentHashMap;

public class CommandTest {
	// ����ģʽ
	private String commandTag="CommandTest";
	// ��ת�Ͷ���
	// �ýӿ��� �ӿڱ�����= new �ӿ�����������������������ʵ�ֽӿ��еķ�����
	// ����ǿ��Կ������õ���ת�Ͷ�����ʵ������ӿڵģ�Ҫ��ס��ת�Ͷ����ܵ���������д����ķ�����
	// ��ʵ�������������������̳�ʵ�ֽӿ��еķ�����
	private Command command = new Command() {
		@Override
		public void process(int[] target) {
			String dsString=commandTag;
		}
	};
	//���ַ���������Command�ӿڵ�ʵ����
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
		// ��һ�δ������飬���崦����Ϊȡ����PrintCommand
		pa.process(target, new PrintCommand());
		System.out.println("------------------");
		// �ڶ��δ������飬������Ϊȡ����AddCommand
		pa.process(target, new AddCommand());
		//�����ڲ��ࣺ����ֻʵ��һ�ε�ʱ��ʹ��
		pa.process(target,new Command() {
			@Override
			public void process(int[] target) {
				int sum = 0;
				for (int tmp : target) {
					sum += tmp;
				}
				System.out.println("����Ԫ�ص��ܺ���:" + sum);
			}
		});
	}
}

class PrintCommand implements Command {
	public void process(int[] target) {
		for (int tmp : target) {
			System.out.println("�������Ŀ������Ԫ��:" + tmp);
		}
	}
}

class AddCommand implements Command {
	public void process(int[] target) {
		int sum = 0;
		for (int tmp : target) {
			sum += tmp;
		}
		System.out.println("����Ԫ�ص��ܺ���:" + sum);
	}
	public interface OnClickListener {
        void onClick();
    }
}
