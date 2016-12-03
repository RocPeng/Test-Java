package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
	
	public static void println(Object object){
		System.out.println(object);
	}
	public static void print(Object object){
		System.out.print(object);
	}
	class myThread extends Thread{
		@Override
		public void run() {
			
			super.run();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		println("------Iterator和ListIterator--------");
		List<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		list1.add("aaa");
		list1.add("bbb");
		list1.add("ccc");
		list2.add("aaa");
		list2.add("bbb");
		list2.add("ccc");
		Iterator<String> iterator1=list1.iterator();
		ListIterator<String> iterator2=list2.listIterator();
		while(iterator1.hasNext()){
			if (iterator1.next().equals("bbb")) {
				iterator1.remove();
			}
		}
		while(iterator2.hasNext()){
			if (iterator2.next().equals("bbb")) {
				iterator2.add("添加的");
			}
		}
		println(list1);
		println(list2);
		while (iterator2.hasPrevious()) {
			print(iterator2.previous()+" ");
		}println("");
		
		println("------ArrayList和Vector----");
		ArrayList<String> list3=new ArrayList<>();
	}

}
