import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JiechengTest {
	private static Scanner scanner;// �����ȡ����̨����
	public static void main(String[] args) {
		 System.out.println("������һ������0������");
	        scanner = new Scanner(System.in);
	         String input=scanner.next();
	         Pattern pattern = Pattern.compile("[0-9]*");
	         Matcher isNum = pattern.matcher(input);
	         if(!isNum.matches())
	         {
	        	 System.out.println("�����������˷����ַ���");
	        	 
	         }
	         else if (0!=Double.parseDouble(input)) {
	        	double k= Double.parseDouble(input);
	        	 double sum=0;
	        	 double b=1;
	        	 for (int i=1;i<=k;i++)
	        	 {
	        		 b=b*i;
	        		 sum=sum+(1.0/b);
	        		 System.out.println(b);
	        	 }
	        	 System.out.println(sum);			
			}else {
				System.out.println("��������ֲ���Ϊ0");
			}
	}

}
