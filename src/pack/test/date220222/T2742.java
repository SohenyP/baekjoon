/*자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.*/

package pack.test.date220222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T2742 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = n; i > 0; i--) {
			System.out.println(i);
		}
	}
}
