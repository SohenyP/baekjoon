package pack.test.date220221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class T2884 {

	public static void main(String[] args) throws IOException {
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int h = scan.nextInt();
		 * int m = scan.nextInt();
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//띄어쓰기로 문장 구분해서 각각 변수에 담기!
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		if (m < 45) {
			if (h == 0) {
				h = 24;
			}
			h = h - 1;
			m = m + 60;
		}
		System.out.print(h + " ");
		System.out.println(m - 45);
	}
}
