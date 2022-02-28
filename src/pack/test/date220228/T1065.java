package pack.test.date220228;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T1065 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(check(n));
	}
	
	public static int check(int num) {
		int cnt = 0;
		
		if(num < 100) {
			return num;
		}
		else {
			cnt = 99;
			if(num == 1000) {
				num = 999;
			}
			
			for (int i = 100; i <= num; i++) {
				int h = i/100;
				int t = (i/10) % 10;
				int o = i % 10;
				
				if((h - t) == (t - o)) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}
