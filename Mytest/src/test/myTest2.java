package test;

import java.util.Scanner;

public class myTest2 {
	public static void main(String args[]){
		inputTest();
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
}
