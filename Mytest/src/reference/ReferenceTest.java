package reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Scanner;

import com.google.common.base.Equivalence;

public class ReferenceTest {
	// 弱引用
	public static void main(String[] args) throws Exception{
		System.out.println("--------弱引用-------");
		//创建一个字符串对象
		String str=new String("转眼都飘散如烟");
		//创建一个弱引用，让此弱引用引用到"转眼都飘散如烟"字符串
		WeakReference<String> wr=new WeakReference<String>(str);
		//切断str引用和"转眼都飘散如烟"字符串之间的引用
		str=null;
		//去除弱引用引用的对象
		System.out.println(wr.get());
		//强制垃圾回收
		System.gc();
		System.runFinalization();
		//再次取出弱引用的对象
		System.out.println(wr.get());
		System.out.println("--------虚引用-------");
		String str2=new String("我曾经堕入无边黑暗");
		//创建一个引用队列
		ReferenceQueue rq=new ReferenceQueue();
		//创建一个虚引用，让此虚引用引用到“我曾经堕入无边黑暗”字符串
		PhantomReference pr=new PhantomReference(str2, rq);
		//切断str2引用和"我曾经堕入无边黑暗"字符串之间的引用
		str2=null;
		//取出虚引用所引用的对象，并不能通过虚引用获取被引用的对象，所以此处为null
		System.out.println(pr.get());
		//强制垃圾回收
		System.gc();
		System.runFinalization();
		//垃圾回收之后，虚引用将被放入引用队列中
		//取出引用队列中最先进入队列的引用于pr比较
		System.out.println(rq.poll()==pr);
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		 System.out.println("string："+string);
	}
}
