package scanner;

import java.util.Scanner;

public class ScannerKeyboardTest {

	public static void main(String[] args) {
		//System.in代表标准输入
		Scanner sc=new Scanner(System.in);
		//增加下面一行将只把回车作为分隔符
//		sc.useDelimiter("\n");
		//判断是否还有下一个输入项
		while (sc.hasNext()) {
			//输出输入项
			System.out.println("键盘的输入内容是:"+sc.next());
		}
	}

}
