package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class myTest {

	public static void main(String[] args) {
//		List<String> L1=new ArrayList<>();
//		List<String> L2=new ArrayList<>();
//		L1.add("xat");
//		L1.add("bbn");
//		L2.add("bbn");
//		L2.add("xat");
//		Collections.sort(L1);
//		Collections.sort(L2);
//		if (L1.toString().equals(L2.toString())) {
//			System.out.println("相同");
//		}else {
//			System.out.println("不相同");
//		}
//		int a,b,c,x;  
//		for(a=0;a<=1;a++)  
//		  for(b=0;b<=1;b++)  
//		    for(c=0;c<=1;c++)  
//		    	for(x=0;x<=1;x++) 
//		       if(((!itob(a))&&(itob(a))||(itob(a))&&(!itob(0)||itob(x)))
//		    	   &&((!itob(b))&&(itob(x))||(itob(b))&&(!itob(1)||!itob(0)))    
//		        &&((!itob(c))&&(!itob(0))||(itob(c))&&(itob(1)||itob(x)))) 
//		       {  
//		    	   System.out.println("a="+a);
//		    	   System.out.println("b="+b);
//		    	   System.out.println("c="+c);
//		    	   System.out.println("x="+x);
//		       } 
		
//		String string="aaa=bbb=ccc";
//		String[] paramArr = string.split("=");
//		System.out.println(paramArr[0]);
//		System.out.println(paramArr[1]);
//		System.out.println(string.substring(paramArr[0].length()));
		System.out.print("A Student (No:");
		Scanner cin = new Scanner(System.in);
		int a= cin.nextInt();
		System.out.println(") Changes");
		
	}

	static boolean itob(int i) {
		if (i <= 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * 判断是否以某字符串开头来判定是否属于某类文件 例如：ppt pptx都以“ppt”开头
	 */
	public static boolean isSimilar(String fileExt, String regEx) {
		// 正则表达式规则
		String regExString = "^" + regEx + ".*";
		// 编译正则表达式
		Pattern pattern = Pattern
				.compile(regExString, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(fileExt);
		return matcher.find();
	}

	/**
	 * 路径名中提取文件名
	 */
	public static String getFileName(String filePath) {
		String fileName = "";
		if ((filePath != null) && (filePath.length() > 0)) {
			int dot = filePath.lastIndexOf('/');
			if ((dot > -1) && (dot < (filePath.length() - 1))) {
				fileName = filePath.substring(dot + 1);
			}
		}
		return fileName;
	}
}
