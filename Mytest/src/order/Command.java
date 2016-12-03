package order;

import test.TestDemo.intTest;


public interface Command {
	//process方法用于封装“处理行为”
	void process(int[] target);
}
