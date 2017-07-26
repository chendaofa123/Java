package String_Test;

public class StringBufferTest {
	public static void main(String[] args) {
		//append()
		 StringBuffer sb = new StringBuffer("abcd");
	        sb.append("true");
	        System.out.println(sb);
	        
	        //deleteCharAt()
	        StringBuffer sb1 = new StringBuffer("Test");
	        sb1. deleteCharAt(1);
	        System.out.println(sb1);
	        
	        //insert()
	        StringBuffer sb2 = new StringBuffer("TestString");
	        sb2.insert(4,"false");
	        System.out.println(sb2);
	}

}
