package test;

import java.util.Arrays;
import java.util.Scanner;

public class myTest2 {
	public static void main(String args[]){
		myTest2 test2=new myTest2();
		test2.forTest();
	}
	public static void inputTest(){
		Scanner input=new Scanner(System.in);
		System.out.println("please input:");
		String inputNum=input.next();
		System.out.println("output:"+inputNum);
		
		Scanner inputIn=new Scanner(System.in);
		System.out.println("please input int:");
		int inputNumInt=inputIn.nextInt();
		System.out.println("output:"+inputNumInt);
	}
	
	public static void scoreTest(){
		Scanner input=new Scanner(System.in);
		System.out.print("输入加分前的成绩:");
		int score=input.nextInt();
		int scoreCount=0;
		while (score<=60) {
			score++;
			scoreCount++;
		}
		System.out.println("一共加了:"+scoreCount+"次");
		System.out.println("分数:"+score);
	}
	
	public void forTest(){
		// 定义一个整型数组，保存成绩信息
		int[] scores = { 89, 72, 64, 58, 93 };
		// 对Arrays类对数组进行排序
		Arrays.sort(scores);
		// 使用foreach遍历输出数组中的元素
		for (int i : scores) {
			System.out.println(i);
		}
	}
	
	public class Son{
		private Son son;
		private Son getInstance(){
			if (son==null) {
				son=new Son();
			}
			return son;
		}
	}
}
