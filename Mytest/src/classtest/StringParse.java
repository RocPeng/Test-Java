package classtest;

public class StringParse {
	
	public StringParse() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String intStr="123";
		int a1=Integer.parseInt(intStr);
		int a2=new Integer(intStr);
		System.out.println("a1="+a1);
		System.out.println("a2="+a2);
		String floatStr="23.4";
		float f1=Float.parseFloat(floatStr);
		float f2=new Float(floatStr);
		System.out.println("f1:"+f1);
		System.out.println("f2:"+f2);
		System.out.println("str1:"+String.valueOf(2));
		System.out.println("str2:"+String.valueOf(2f));
		System.out.println("***********************");
		Integer integer=new Integer(8);
		System.out.println("8�İ�װʵ���Ƿ����5.0:"+(integer>5.02));
		
		StringParse parse1=new StringParse();
		StringParse parse2=new StringParse();
		StringParse parse3=parse1;
		System.out.println("parse1==parse2�Ƚ�:"+(parse1==parse2));
		System.out.println("parse1==parse3�Ƚ�:"+(parse1==parse3));
		
		String s1=new String("Hello");
		String s2=new String("Hello");
		System.out.println("s1��s2�����Ƿ�==��"+(s1==s2));
		System.out.println("s1��s2�����Ƿ�equals��"+s1.equals(s2));
	}

}
