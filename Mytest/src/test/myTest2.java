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
		System.out.print("����ӷ�ǰ�ĳɼ�:");
		int score=input.nextInt();
		int scoreCount=0;
		while (score<=60) {
			score++;
			scoreCount++;
		}
		System.out.println("һ������:"+scoreCount+"��");
		System.out.println("����:"+score);
	}
	
	public void forTest(){
		// ����һ���������飬����ɼ���Ϣ
		int[] scores = { 89, 72, 64, 58, 93 };
		// ��Arrays��������������
		Arrays.sort(scores);
		// ʹ��foreach������������е�Ԫ��
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
