package String_Test;

public class StringTest1 {
	public static void main(String args[]) {
//����
	   String site = "chendaofa";
	   int len = site.length();
	   System.out.println( "���ֵĳ��� : " + len );
//ת��Ϊ����	       
	   String str = "This is a String.";
	   char[] arr = str.toCharArray();
	   System.out.println(arr);
	   //��ȡĳ��λ�õ���ĸ
	   String s = "This is a String";
	   char result = s.charAt(8);
	   System.out.println(result);
	   
	   //indexof
	   String str1 = "abcdefghijklmnabc"; 
	   // ��ͷ��ʼ�����Ƿ����ָ�����ַ� 
	   System.out.println(str1.indexOf("c"));	 
	   // �ӵ��ĸ��ַ�λ�ÿ�ʼ����������� 
	   System.out.println(str1.indexOf("c", 3)); 
	   //��ָ���ַ�����û�и��ַ���ϵͳ����-1 
	   System.out.println(str1.indexOf("x")); 
	   
	   //trim()
	   String str2 = " This is sioeye ";
	   System.out.println("__" + str2 + "__");
	   System.out.println("__" + str2.trim() + "__"); 
	       

	  }

}
