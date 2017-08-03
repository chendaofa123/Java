import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberToChinase {
private static Scanner scanner;// 方便获取控制台输入
private static String input;// 输入的数字字符串	      
public static void main(String[] args) {
	  System.out.println("请输入一串数字：如1234，最多5位");
      scanner = new Scanner(System.in);
      input = scanner.nextLine();
      System.out.println(getOutput(input));
} 
  // 单个数字中文表示
  private static String numbers[] = 
  { "零", "一", "二", "三", "四", "五", "六", "七", "八", "九", "十" };	     
  private static String units[] = 
  {  "" ,"十", "百", "千", "万"};// 单位	        
  // 将数字字符串串中的每个数字字符按照从左到右的顺序放入数组
  private static String result[];
 
  //主要方法
  public static String getOutput(String input) 
  {
      //判断是否为整数
	  Pattern pattern = Pattern.compile("[0-9]*");
      Matcher isNum = pattern.matcher(input);
      if(!isNum.matches())
      {
     	return "你的输入包含了非数字符号";   	 
      }
      //判断输入的位数
      if(input.length()>5)
      {
          return "最多输入5位数字";
      }
      StringBuffer sb = new StringBuffer();
      int back = 0;
      result = new String[input.length()];// result数组初始化
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
