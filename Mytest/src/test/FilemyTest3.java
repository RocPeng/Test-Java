package test;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.sun.jna.platform.unix.X11.XClientMessageEvent.Data;

public class FilemyTest3 {
	public static void println(Object object){
		System.out.println(object);
	}
	public static void main(String args[]){
//		String str1="test.ppt";
//		String str3="test";
//		int dot1=str1.lastIndexOf('.');
//		println(dot1);
//		int dot3=str3.lastIndexOf('.');
//		println(dot3);
//		str1=str1.substring(0,dot1)+"(1)"+str1.substring(dot1,str1.length());
//		println(str1);
//		str3=str3.substring(0,4)+"(1)"+str3.substring(4,str3.length());
//		println(str3);
		
//		getFileName("D:///test/","my.txt");
//		List<String> fileList=new ArrayList<String>();
//		getFiles("D:///test",fileList);
//		println(fileList);
		
		File file=new File("D:///test/my(2).txt");
		println(getDateTime(file.lastModified()));
	}
	private static void getFileName(String folderPath,String fileName){
		File fileDir = new File(folderPath);
		if (!fileDir.exists()) {
			try {
				// 按照指定的路径创建文件夹
				fileDir.mkdirs();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		File file=new File(folderPath+fileName);
		int i=0;
		while(file.exists()){
			fileName=fileName.replace("("+(i-1)+")", "");
			int dot=fileName.indexOf('.');
			if (dot==-1) {
				dot=fileName.length();
			}
			fileName=fileName.substring(0,dot)+"("+i+")"+fileName.substring(dot,fileName.length());
			i++;
			file=new File(folderPath+fileName);
		}
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    /**
     * 通过递归得到某一路径下所有的文件的全路径,分装到list里面
     * 
     * @param filePath
     * @param filelist
     * @return
     */
    public static List<String> getFiles(String filePath, List<String> filelist) {

        File root = new File(filePath);
        if (!root.exists()) {
        	root.mkdirs();
        } else {
            File[] files = root.listFiles();
            Arrays.sort(files, new CompratorByLastModified());  
            for (File file : files) {
                if (file.isDirectory()) {
                    getFiles(file.getAbsolutePath(), filelist);
                } else {
                    //logger.info("目录:" + filePath + "文件全路径:" + file.getAbsolutePath());
                    filelist.add(file.getAbsolutePath());
                }
            }
        }
        return filelist;
    }
     
    //根据文件修改时间进行比较的内部类
    static class CompratorByLastModified implements Comparator<File> {  
        
        public int compare(File f1, File f2) {  
            long diff = f1.lastModified() - f2.lastModified();  
            if (diff > 0) {  
                   return 1;  
            } else if (diff == 0) {  
                   return 0;  
            } else {  
                  return -1;  
            }  
        }  
    }  

    public static String getDateTime(long time) {
    	Date date=new Date(time);
		SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd");
		String currentTime = timeFormat.format(date);
		return currentTime;
	}
    
}

