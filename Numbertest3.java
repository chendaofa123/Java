import java.util.Scanner;

public class Numbertest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
        while(true) {  
            System.out.println("������Ҫ����ת��������......");  
            String str = scanner.next();
            if("-1".equals(str))  
                return;  
            new Numbertest3().convert(Integer.parseInt(str));  
        } 
	}
	public void convert(int number) {  
        //���ֶ�Ӧ�ĺ���  
        String[] num = {"��","һ","��","��","��","��","��","��","��","��"};  
        //��λ  
        String[] unit = {"","ʮ","��","ǧ","��","ʮ","��","ǧ","��","ʮ","��","ǧ","����"};  
        //����������ת��Ϊ�ַ���  
        String result = String.valueOf(number);  
        //�����ַ����ָ�Ϊ������  
        char[] ch = result.toCharArray();  
        //��� �ַ���  
        String str = "";  
        int length = ch.length;  
        for (int i = 0; i < length; i++) {  
            int c = (int)ch[i]-48;  
            if(c != 0) {  
                str += num[c]+unit[length-i-1];  
            } else {
                if(i==length-1){}
                else{
                    if(ch[i+1]!='0'){
                        str += num[c];
                    }
                }
            }  
        }  
        System.out.println(str);  
    }


}
