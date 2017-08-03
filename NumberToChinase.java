import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberToChinase {
private static Scanner scanner;// �����ȡ����̨����
private static String input;// ����������ַ���	      
public static void main(String[] args) {
	  System.out.println("������һ�����֣���1234�����5λ");
      scanner = new Scanner(System.in);
      input = scanner.nextLine();
      System.out.println(getOutput(input));
} 
  // �����������ı�ʾ
  private static String numbers[] = 
  { "��", "һ", "��", "��", "��", "��", "��", "��", "��", "��", "ʮ" };	     
  private static String units[] = 
  {  "" ,"ʮ", "��", "ǧ", "��"};// ��λ	        
  // �������ַ������е�ÿ�������ַ����մ����ҵ�˳���������
  private static String result[];
 
  //��Ҫ����
  public static String getOutput(String input) 
  {
      //�ж��Ƿ�Ϊ����
	  Pattern pattern = Pattern.compile("[0-9]*");
      Matcher isNum = pattern.matcher(input);
      if(!isNum.matches())
      {
     	return "�����������˷����ַ���";   	 
      }
      //�ж������λ��
      if(input.length()>5)
      {
          return "�������5λ����";
      }
      StringBuffer sb = new StringBuffer();
      int back = 0;
      result = new String[input.length()];// result�����ʼ��
      for (int i = 0; i < result.length; i++) 
      {
          result[i] = String.valueOf(input.charAt(i));
      }
      
      for (int i = 0; i < result.length; i++) 
      {
          if (!result[i].equals("0")) 
          {
              back = result.length -i-1;	                
              sb.append(numbers[Integer.parseInt(result[i])]);
              sb.append(units[back]);
              System.out.println(sb+"1");
          }
           else if ( i<result.length-1 && !result[i + 1].equals("0"))                               
          {
                 sb.append(numbers[0]);
                 System.out.println(sb+"4");                  
          } 
      }
      return sb.toString();
  }

}
