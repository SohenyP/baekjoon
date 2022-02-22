/*
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * */

package pack.test.date220222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T11021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append("Case #"+ i + ": ");
			//한 append안에 모두 삽입하면 연산이 아닌 String처럼 출력됨
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+"\n");
		}
		System.out.println(sb);
	}
}
