import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NumberTest2 {
	 private static Scanner scanner;
	 private static long input;
	public static void main(String []args){
		System.out.println("������һ�����֣���1234�����9λ");
        scanner = new Scanner(System.in);
        input = scanner.nextLong();
		//long l=1112340678;
		System.out.print(new NumberTest2().transfer(input));
		}
	
	
	public String transfer(long l){
		String[] unit1={"��","һ","��","��","��","��","��","��","��","��"};
		String[] unit2={"","ʮ","��","ǧ"};
		String[] unit3={"","��","��","����"};
		String result="";
		//�Ƚ�����ÿ��λ�ָ��һ�죬��123456789����Ϊ1��2345��,6789������list��;
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
