package test;

import java.io.UnsupportedEncodingException;


public class StrDecodeTest {
	public static void println(Object object){
		System.out.println(object);
	}

	public static void main(String args[]){
		/*String testStr = "�й�";
	    try {
	        // �õ�ָ��������ֽ����� �ַ���--->�ֽ�����
	        byte[] t_iso = testStr.getBytes("ISO8859-1");
	        byte[] t_gbk = testStr.getBytes("GBK");
	        byte[] t_utf8 = testStr.getBytes("UTF-8");
	        System.out.println("ʹ��ISO����..." + t_iso.length);
	        System.out.println("ʹ��GBK����..." + t_gbk.length);
	        System.out.println("ʹ��UTF8����..." + t_utf8.length);
	        // ���������װ
	        String ut_iso = new String(t_iso, "ISO8859-1");
	        String ut_gbk = new String(t_gbk, "GBK");
	        String ut_utf8 = new String(t_utf8, "UTF-8");
	        System.out.println("ʹ��ISO���������ISO��װ..." + ut_iso);
	        System.out.println("ʹ��GBK���������GBK��װ..." + ut_gbk);
	        System.out.println("ʹ��UTF8���������UTF8��װ..." + ut_utf8);
	        // ��ʱ��Ҫ�������iso�ַ���������
	        // ��������GBK/UTF8�������ISO8859-1��װ���ַ���������ʱ���򼴿ɻ����ȷ�����ַ�
	        String t_utf8Toiso = new String(t_utf8, "ISO8859-1");
	        // ��iso������ַ������л�ԭ
	        String ut_utf8Toiso = new String(t_utf8Toiso.getBytes("ISO8859-1"),"UTF-8");
	        System.out.println("ʹ��ISO��װutf8�����ַ�..." + t_utf8Toiso);
	        System.out.println("ʹ��ISO����utf8�����ַ�..." + ut_utf8Toiso);
	    } catch (UnsupportedEncodingException e) {
	        e.printStackTrace();
	    }*/
		
		/*String oldStr="�������";
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
