package reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Scanner;

import com.google.common.base.Equivalence;

public class ReferenceTest {
	// ������
	public static void main(String[] args) throws Exception{
		System.out.println("--------������-------");
		//����һ���ַ�������
		String str=new String("ת�۶�Ʈɢ����");
		//����һ�������ã��ô����������õ�"ת�۶�Ʈɢ����"�ַ���
		WeakReference<String> wr=new WeakReference<String>(str);
		//�ж�str���ú�"ת�۶�Ʈɢ����"�ַ���֮�������
		str=null;
		//ȥ�����������õĶ���
		System.out.println(wr.get());
		//ǿ����������
		System.gc();
		System.runFinalization();
		//�ٴ�ȡ�������õĶ���
		System.out.println(wr.get());
		System.out.println("--------������-------");
		String str2=new String("�����������ޱߺڰ�");
		//����һ�����ö���
		ReferenceQueue rq=new ReferenceQueue();
		//����һ�������ã��ô����������õ��������������ޱߺڰ����ַ���
		PhantomReference pr=new PhantomReference(str2, rq);
		//�ж�str2���ú�"�����������ޱߺڰ�"�ַ���֮�������
		str2=null;
		//ȡ�������������õĶ��󣬲�����ͨ�������û�ȡ�����õĶ������Դ˴�Ϊnull
		System.out.println(pr.get());
		//ǿ����������
		System.gc();
		System.runFinalization();
		//��������֮�������ý����������ö�����
		//ȡ�����ö��������Ƚ�����е�������pr�Ƚ�
		System.out.println(rq.poll()==pr);
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		 System.out.println("string��"+string);
	}
}
