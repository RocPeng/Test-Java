package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import test.TestDemo.intTest;

public class CollectionTest {

	public static void print(Object obj){
		System.out.print(String.valueOf(obj));
	}
	public static void println(Object obj){
		System.out.println(String.valueOf(obj));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		println("\n-----HashSet------");
		Set<String> set=new HashSet<String>();
		set.add("ֵ1");
		set.add("ֵ1");
		set.add("ֵ2");
		set.add("ֵ3");
		set.add("ֵ3");
		set.add("ֵ4");
		println(set);
		for(String s:set){
			print(s+",");
		}
		println("\n-----LinkedList-----");
		List<String> list=new LinkedList<String>();
		list.add("ֵ1");
		list.add("ֵ2");
		list.add("ֵ2");
		list.add("ֵ3");
		list.add("ֵ4");
		list.add("ֵ4");
		System.out.println(list);
		for(String s:list){
			print(s+",");
		}
		println("\n-----Iterator��ʽ����-----");
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			if (it.next().equals("ֵ2")) {
				it.remove();
			}
		}
		println(list);
		ListIterator<String> listIt=list.listIterator();
		while (listIt.hasNext()) {
			if(listIt.next().equals("ֵ3")){
				listIt.add("ֵ3�����");
			}
		}
		println(list);
		println("-------TreeSet-----------");
		TreeSet<Integer> treeSet=new TreeSet<Integer>();
		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(10);
		treeSet.add(-9);
		println("treeSet�Զ�����:"+treeSet);
		
	}
	
	class test implements Comparable<Integer>{

		@Override
		public boolean equals(Object obj) {
			return true;
		}
		
		@Override
		public int compareTo(Integer o) {
			
			return 1;
		}
		
	}

}
