import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JiechengTest {
	private static Scanner scanner;// 方便获取控制台输入
	public static void main(String[] args) {
		 System.out.println("请输入一个大于0的整数");
	        scanner = new Scanner(System.in);
	         String input=scanner.next();
	         Pattern pattern = Pattern.compile("[0-9]*");
	         Matcher isNum = pattern.matcher(input);
	         if(!isNum.matches())
	         {
	        	 System.out.println("你得输入包含了非数字符号");
	        	 
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
				System.out.println("输入的数字不能为0");
			}
	}

}
