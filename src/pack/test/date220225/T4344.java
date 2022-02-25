/*대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 
당신은 그들에게 슬픈 진실을 알려줘야 한다.

첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 
이어서 N명의 점수가 주어진다. 
점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.*/
package pack.test.date220225;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int snum = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			snum = Integer.parseInt(st.nextToken());

			double sum = 0;
			double avg = 0;
			int cnt = 0;
			double r = 0;
			double[] g = new double[snum];

			for (int j = 0; j < snum; j++) {
				g[j] = Integer.parseInt(st.nextToken());
				sum += g[j];
			}
			avg = sum / snum;

			for (double k : g) {
				if (k > avg) {
					cnt++;
				}
			}
			 r = ((double)cnt/snum) * 100;
			 
			 sb.append(String.format("%.3f", r)+"%\n");
		}
		System.out.println(sb);
	}
}
