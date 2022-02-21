package pack.test.date220221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T2525 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		
		b = b + c;
		if(b > 59) {
			int t = b/60;
			for (int i = 0; i < t; i++) {
				b -= 60;
				a += 1;
			}
			if (a > 23) {
				a -= 24;
			}
			
		}
		
		System.out.println(a+" "+b);
	}

}
