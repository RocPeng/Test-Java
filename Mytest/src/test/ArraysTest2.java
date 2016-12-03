package test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import com.alibaba.fastjson.JSON;


public class ArraysTest2 {
	
	public void test(){
		
	}
	public int test(int x){
		return 0;
	}
	public static void println(Object object){
		System.out.println(object);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException,MalformedURLException{
//		int[] arr1=new int[]{3,-4,25,16,30,18};
		//对数组arr1并发排序
//		int x=1080;
//		float y=3.0f;
//		int z=(int) (x/y);
//		System.out.println("结果:"+x/y);
//		System.out.println("结果z:"+z);
		//Map Json测试
		Map<String, Object> inner=new HashMap<>();
		inner.put("in", 123);
		Map<String, Object> outer=new HashMap<>();
		outer.put("out", inner);
		String str=outer.toString();
		System.out.println("map结果:"+outer);
		System.out.println("str结果:"+str);
		String jsonStr=JSON.toJSONString(outer);
		String test3=jsonStr.toString();
		System.out.println("jsonstr结果:"+jsonStr);
		System.out.println("jsonstr转str结果:"+test3);
		//String转map
//		Map<String, Object> test1=JSON.parseObject(str, Map.class);
		Map<String, Object> test2=JSON.parseObject(jsonStr, Map.class);
//		System.out.println("转换后str结果:"+test1);
		System.out.println("转换后jsonStr结果:"+test2);
		
		String string="共有%1$s个联系人";
		String string2=String.format(string, String.valueOf(100));
		System.out.println("format:"+string2);
		
		Set<Map<String, String>> set=new HashSet<>();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
			}
		}).start();
//		URL url =  new URL("www.baidu.com");
//		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
//		InputStreamReader input=new InputStreamReader(connection.getInputStream());
//		connection.setRequestMethod("post");
//		
//		HttpClient client=new DefaultHttpClient();
//		HttpGet get=new HttpGet(url.toString());
//		HttpPost post=new HttpPost();
		
		Map<String,String> map1=new HashMap<>();
		Map<String,String> map2=new HashMap<>();
		Map<String,String> map3=new HashMap<>();
		Map<String,String> map4=new HashMap<>();
		map1.put("1", "1");
		map4.put("1", "1");
		map2.put("2", "2");
		map3.put("3", "3");
		List<Map<String, String>> list1=new ArrayList<>();
		List<Map<String, String>> list2=new ArrayList<>();
		list1.add(map1);
		list1.add(map2);
		list2.add(map3);
		list2.add(map4);
		//交集和并集和差集
		List<Map<String, String>> list_jiao=new ArrayList<>();
		List<Map<String, String>> list_bing_di=new ArrayList<>();
		List<Map<String, String>> list_bing=new ArrayList<>();
		List<Map<String, String>> list_cha=new ArrayList<>();
		list_bing.addAll(list1);
		list_bing_di.addAll(list1);
		list_jiao.addAll(list1);
		list_cha.addAll(list1);
		
		list_bing.addAll(list2);
		list_jiao.retainAll(list2);
		list_cha.removeAll(list2);
		list_bing_di.removeAll(list_jiao);
		list_bing_di.addAll(list2);
		println("=========================");
		println("并集"+list_bing);
		println("无重复并集"+list_bing_di);
		println("交集"+list_jiao);
		println("差集"+list_cha);
	}

}
