/*9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

예를 들어, 서로 다른 9개의 자연수

3, 29, 38, 12, 57, 74, 40, 85, 61

이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.*/


package pack.test.date220224;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int idx = 0;
		int cnt = 0;
		
		for (int i : arr) {
			cnt++;
			if(i > max) {
				max = i;
				idx = cnt;
			}
		}
		System.out.println(max);
		System.out.println(idx);
	}
}
