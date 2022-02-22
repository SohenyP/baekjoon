/*첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.*/

package pack.test.date220222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T2438 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		br.close();
		System.out.println(sb);
	}
}
