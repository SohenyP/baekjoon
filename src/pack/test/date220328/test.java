package pack.test.date220328;

public class test {
	
	public static void main(String[] args) {
		
		//String
		String str = "hello";
		System.out.println("str = hello : " + str.hashCode());
		str = str + " world";
		System.out.println("str = hello world : " + str.hashCode());

		
		//StringBuilder
		StringBuilder str1 = new StringBuilder();
		str1.append("hello");
		System.out.println("str1 = hello : " + str1.hashCode());
		str1.append(" world");
		System.out.println("str1 = hello world : " + str1.hashCode());
		
		
		//StringBuffer
		StringBuffer str2 = new StringBuffer();
		str2.append("hello");
		System.out.println("str2 = hello : " + str2.hashCode());
		str2.append(" world");
		System.out.println("str2 = hello world : " + str2.hashCode());
		
	}

}
