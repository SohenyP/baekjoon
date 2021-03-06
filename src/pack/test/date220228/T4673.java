package pack.test.date220228;

import java.io.IOException;

public class T4673 {

	public static void main(String[] args) throws IOException {
		
		boolean[] check = new boolean[10001];
		
		 for (int i = 1; i <= 10000; i++) {
			int n = d(i);
			
			if(n <= 10000) {
				check[n] = true; 
			 }
		}
		 
		 StringBuilder sb = new StringBuilder();
		 
		 for (int i = 1; i <= 10000; i++) {
			if(!check[i]) {
				sb.append(i+"\n");
			}
		}
		 System.out.println(sb);
		 
	}
	
	public static int d(int num) {
		int sum = num;
		
		while (num != 0) {
			sum = sum + (num % 10);
			num /= 10;
		}
		return sum;		
	}
}
