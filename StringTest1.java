package String_Test;

public class StringTest1 {
	public static void main(String args[]) {
//长度
	   String site = "chendaofa";
	   int len = site.length();
	   System.out.println( "名字的长度 : " + len );
//转化为数组	       
	   String str = "This is a String.";
	   char[] arr = str.toCharArray();
	   System.out.println(arr);
	   //获取某个位置的字母
	   String s = "This is a String";
	   char result = s.charAt(8);
	   System.out.println(result);
	   
	   //indexof
	   String str1 = "abcdefghijklmnabc"; 
	   // 从头开始查找是否存在指定的字符 
	   System.out.println(str1.indexOf("c"));	 
	   // 从第四个字符位置开始往后继续查找 
	   System.out.println(str1.indexOf("c", 3)); 
	   //若指定字符串中没有该字符则系统返回-1 
	   System.out.println(str1.indexOf("x")); 
	   
	   //trim()
	   String str2 = " This is sioeye ";
	   System.out.println("__" + str2 + "__");
	   System.out.println("__" + str2.trim() + "__"); 
	       

	  }

}
