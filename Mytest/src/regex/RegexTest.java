package regex;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="a\\C";
		System.out.println(str);
		String pattern="\\u0041\\\\";
		String pattern2="\tdf";
		String pattern3="\\a";
		String pattern4="[a-z]";
//		Pattern pa=Pattern.compile(pattern);
		str=str.replaceAll(pattern, "P");
		System.out.println(str);
		System.out.println(pattern);
		System.out.println(pattern2);
		System.out.println("-----------");
		Pattern p=Pattern.compile("a*b");
		Matcher m=p.matcher("aaaaaaaaab");
		boolean b=m.matches();
		boolean c=Pattern.matches("a*b", "aaaanb");
		System.out.println(b);
		System.out.println(c);
		
	}

}
