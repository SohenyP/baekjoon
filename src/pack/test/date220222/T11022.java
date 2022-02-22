/*두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)*/

package pack.test.date220222;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class T11022 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		int n =Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			//변수 선언 없이 토큰으로 계속 읽어나가면 1 1 1 1 이런 식으로 4개를 입력해야함..
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write("Case #"+ i + ": " + a + " + " + b + " = ");
			bw.write(a + b + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
		System.out.println(bw);
	}

}
