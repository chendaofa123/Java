package String_Test;

public class StringBuiderTest {
	public static void main(String[] args) {
		 StringBuilder MyStringBuilder = new StringBuilder("Hello World!");

	    MyStringBuilder.append(" What a beautiful day.");
	     
	     System.out.println(MyStringBuilder);
	     
	     MyStringBuilder.insert(6,"Beautiful ");
	     System.out.println(MyStringBuilder);
	     
	     MyStringBuilder.replace(5, 7, "sddgf");
	     System.out.println(MyStringBuilder);
	}

}
