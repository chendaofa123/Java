import java.util.Scanner;

public class Numbertest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  
        while(true) {  
            System.out.println("请输入要进行转换的数字......");  
            String str = scanner.next();
            if("-1".equals(str))  
                return;  
            new Numbertest3().convert(Integer.parseInt(str));  
        } 
	}
	public void convert(int number) {  
        //数字对应的汉字  
        String[] num = {"零","一","二","三","四","五","六","七","八","九"};  
        //单位  
        String[] unit = {"","十","百","千","万","十","百","千","亿","十","百","千","万亿"};  
        //将输入数字转换为字符串  
        String result = String.valueOf(number);  
        //将该字符串分割为数组存放  
        char[] ch = result.toCharArray();  
        //结果 字符串  
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
