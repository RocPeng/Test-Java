package scanner;

import java.util.Scanner;

public class ScannerKeyboardTest {

	public static void main(String[] args) {
		//System.in�����׼����
		Scanner sc=new Scanner(System.in);
		//��������һ�н�ֻ�ѻس���Ϊ�ָ���
//		sc.useDelimiter("\n");
		//�ж��Ƿ�����һ��������
		while (sc.hasNext()) {
			//���������
			System.out.println("���̵�����������:"+sc.next());
		}
	}

}
