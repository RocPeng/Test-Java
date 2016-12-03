package test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.FileNameMap;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UrlConnectionTest {
	public static void println(Object object) {
		System.out.println(object);
	}

	public static void main(String args[]) {
		String str = "http://echat-sit.oss-cn-hangzhou.aliyuncs.com"
				+ "/echat_sit/Attachment/58356fed8e824138ef3e86f0";
		// str="https://dev-app.ums86.com/1.zip";
		try {
			URL url = new URL(str);
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			connection.setDoInput(true);
			connection.setDoInput(true);
			int fileLength = connection.getContentLength();
			connection.connect();

			FileNameMap fileNameMap = connection.getFileNameMap();
			String index = fileNameMap.getContentTypeFor(str);
			println("fileNameMap:" + fileNameMap);
			println("index:" + index);

			Map<String, List<String>> headers = connection.getHeaderFields();
			println(headers);
			List<String> fileDetal = headers.get("Content-Disposition");
			println(fileDetal.size());
			for (int i = 0; i < fileDetal.size(); i++) {
				println(fileDetal.get(i));
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String fileName = getFileName(str);
		println(fileName);

	}

	public static String getFileName(String url) {
		String filename = "tempFile";
		// 从UrlConnection中获取文件名称
		try {
			URL myURL = new URL(url);

			URLConnection conn = myURL.openConnection();
			if (conn == null) {
				return null;
			}
			Map<String, List<String>> hf = conn.getHeaderFields();
			if (hf == null) {
				return null;
			}
			Set<String> key = hf.keySet();
			if (key == null) {
				return null;
			}

			for (String skey : key) {
				List<String> values = hf.get(skey);
				for (String value : values) {
					String result;
					try {
						result = new String(value.getBytes(), "UTF-8");
						int location = result.indexOf("filename");
						if (location >= 0) {
							if (result.contains("filename=")) {
								result = result.substring(location
										+ "filename".length());
								filename = result
										.substring(result.indexOf("=") + 1);
								return filename;
							} else if (result.contains("filename*=")) {
								filename = result.substring(result
										.indexOf("''") + 1);
								return filename;
							}
						}
					} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
					}// ISO-8859-1 UTF-8 gb2312
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 从路径中获取
		filename = url.substring(url.lastIndexOf("/") + 1);
		if(filename.equals("")){
			filename="tempFile";
		}
		return filename;
	}

}
