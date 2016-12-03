package test;

import java.io.UnsupportedEncodingException;


public class StrDecodeTest {
	public static void println(Object object){
		System.out.println(object);
	}

	public static void main(String args[]){
		/*String testStr = "中国";
	    try {
	        // 得到指定编码的字节数组 字符串--->字节数组
	        byte[] t_iso = testStr.getBytes("ISO8859-1");
	        byte[] t_gbk = testStr.getBytes("GBK");
	        byte[] t_utf8 = testStr.getBytes("UTF-8");
	        System.out.println("使用ISO解码..." + t_iso.length);
	        System.out.println("使用GBK解码..." + t_gbk.length);
	        System.out.println("使用UTF8解码..." + t_utf8.length);
	        // 解码后在组装
	        String ut_iso = new String(t_iso, "ISO8859-1");
	        String ut_gbk = new String(t_gbk, "GBK");
	        String ut_utf8 = new String(t_utf8, "UTF-8");
	        System.out.println("使用ISO解码后再用ISO组装..." + ut_iso);
	        System.out.println("使用GBK解码后再用GBK组装..." + ut_gbk);
	        System.out.println("使用UTF8解码后再用UTF8组装..." + ut_utf8);
	        // 有时候要求必须是iso字符编码类型
	        // 可以先用GBK/UTF8编码后，用ISO8859-1组装成字符串，解码时逆向即可获得正确中文字符
	        String t_utf8Toiso = new String(t_utf8, "ISO8859-1");
	        // 将iso编码的字符串进行还原
	        String ut_utf8Toiso = new String(t_utf8Toiso.getBytes("ISO8859-1"),"UTF-8");
	        System.out.println("使用ISO组装utf8编码字符..." + t_utf8Toiso);
	        System.out.println("使用ISO解码utf8编码字符..." + ut_utf8Toiso);
	    } catch (UnsupportedEncodingException e) {
	        e.printStackTrace();
	    }*/
		
		/*String oldStr="我是你的";
		String string = null;
		byte b[] = null;
		try {
			b=oldStr.getBytes("UTF-8");
			string=new String(b);
			println(string);
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		try {
			String newStr = new String(string.getBytes(), "UTF-8");
			println(newStr);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}  */
		String fileNameString1="temp";
		String fileNameString2="temp";
		String fileNameString3="temp";
		String url1="http://www.google.com/test.zip";
		fileNameString1=url1.lastIndexOf("/")>0?url1.substring(url1.lastIndexOf("/") + 1):fileNameString1;
		println(fileNameString1==""?"tempFile":fileNameString1);
		String url2="http://www.google.com/";
		fileNameString2=url2.lastIndexOf("/")>0?url2.substring(url2.lastIndexOf("/") + 1):fileNameString2;
		println(fileNameString2==""?"tempFile":fileNameString2);
		if(fileNameString2.equals("")){
			println("NULL");
		}
		String url3="http://www.google.com";
		fileNameString3=url3.lastIndexOf("/")>0?url3.substring(url3.lastIndexOf("/") + 1):fileNameString3;
		println(fileNameString3==""?"tempFile":fileNameString3);
	}
}
