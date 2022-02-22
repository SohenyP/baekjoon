/*첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
하지만, 오른쪽을 기준으로 정렬한 별*/

package pack.test.date220222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T2439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			//0부터 시작하기 때문에 -(i+1)
			for (int j = 0; j < n - i - 1; j++) {
				sb.append(" ");
			}
			for (int k = 0; k <= i; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		br.close();
		System.out.println(sb);
	}
}
