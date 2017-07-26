import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NumberTest2 {
	 private static Scanner scanner;
	 private static long input;
	public static void main(String []args){
		System.out.println("请输入一串数字：如1234，最多9位");
        scanner = new Scanner(System.in);
        input = scanner.nextLong();
		//long l=1112340678;
		System.out.print(new NumberTest2().transfer(input));
		}
	
	
	public String transfer(long l){
		String[] unit1={"零","一","二","三","四","五","六","七","八","九"};
		String[] unit2={"","十","百","千"};
		String[] unit3={"","万","亿","万亿"};
		String result="";
		//先将该数每四位分割成一快，如123456789：分为1，2345，,6789；放在list中;
		List<Long> list=new LinkedList<Long>();
		while(l!=0){
		list.add(l%10000);
		l=l/10000;
		}
		for(int i=0;i<list.size();i++){
		String s="";
		long temp=list.get(i);
		for(int j=0;j<4;j++,temp=temp/10){
		if(temp%10!=0){
		//System.out.println(temp%10);
		s=unit1[(int)(temp%10)]+unit2[j]+s;
		}
		}
		s=s+unit3[i];
		result=s+result;
		System.out.println(result);
		}
		return result;
		}

}
