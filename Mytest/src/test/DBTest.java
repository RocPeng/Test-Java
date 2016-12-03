package test;

public class DBTest {
	
	public static void println(Object object){
		System.out.println(object);
	}
	
	public static void delete(Integer... ids) {
		println("ids.lengt:"+String.valueOf(ids.length));
		println("ids.lengt:"+String.valueOf(ids[2]));
        if (ids.length > 0) {  
            StringBuffer sb = new StringBuffer();  
            String[] strIds = new String[ids.length];  
            // for (Integer id : ids) {  
            // sb.append('?').append(',');  
            // }  
            for (int i = 0; i < strIds.length; i++) {  
                sb.append('?').append(',');  
                strIds[i] = String.valueOf(ids[i]);  
            }  
            StringBuffer s1=sb;
            sb.deleteCharAt(sb.length() - 1);
            String s2="personid in(" + sb.toString() + ")";
            println(s1);
            println(sb);
            println(s2);
        }  
    } 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		delete(1,2,3);
	}

}
