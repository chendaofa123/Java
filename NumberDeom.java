import java.util.Scanner;

public class NumberDeom {
	private static Scanner scanner;// �����ȡ����̨����
	public static void main(String[] args) {
		  System.out.println("������һ�����֣���1234�����9λ");
	        scanner = new Scanner(System.in);
	        input = scanner.nextLine();
	        System.out.println(getOutput(input));
	  
	}
	  
	    private static String input;// ����������ַ���	        
	    // �����������ı�ʾ
	    private static String numbers[] = 
	    { "��", "һ", "��", "��", "��", "��", "��", "��", "��", "��", "ʮ" };	     
	    private static String units[] = 
	    { "", "ʮ", "��", "ǧ", "��", "ʮ", "��", "ǧ", "��" };// ��λ	        
	    // �������ַ������е�ÿ�������ַ����մ����ҵ�˳���������
	    private static String result[];
	   
	    public static String getOutput(String input) 
	    {
	        if(input.length()>9)
	        {
	            return "�������9λ����";
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
	                back = result.length - i - 1;	                
	                sb.append(numbers[Integer.parseInt(result[i])]);
	                sb.append(units[back]);
	                System.out.println(sb+"1");
	            } 
	            else 
	            {
	                if(i == result.length - 4 && result[i].equals("0"))
	                {
	                    if(result.length==9 && 
	                       result[1].equals("0") && 
	                       result[2].equals("0") && 
	                       result[3].equals("0"))
	                    {
	                        sb.append(numbers[0]);
	                        System.out.println(sb+"2");
	                    }
	                    else
	                    {
	                        sb.append(units[4]);
	                        System.out.println(sb+"3");
	                    }
	                }
	                else
	                {
	                    if ( i<result.length-1 && !result[i + 1].equals("0")) 
	                    {
	                        sb.append(numbers[0]);
	                        System.out.println(sb+"4");
	                       
	                    }
	                }
	            }
	        }
	        return sb.toString();
	    }
	    
}
