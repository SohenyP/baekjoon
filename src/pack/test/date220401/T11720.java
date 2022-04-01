/*문제
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

출력
입력으로 주어진 숫자 N개의 합을 출력한다.*/
package pack.test.date220401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T11720 {

	/*
	 * public static void main(String[] args) throws IOException {
	 * //입력
	 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 * 
	 * //입력될 숫자 갯수 : 사용할 일은 없음
	 * int N = Integer.parseInt(br.readLine());
	 * 
	 * //최종 합
	 * int sum = 0;
	 * 
	 * //getBytes() : String (문자열) 에 대하여 해당 문자열을 하나의 byte 배열로 변환
	 * for(byte val : br.readLine().getBytes()) {
	 * sum += (val - '0');
	 * }
	 * System.out.print(sum);
	 * }
	 */

	public static void main(String[] args) throws IOException {
		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력될 숫자 자릿수
		int N = Integer.parseInt(br.readLine());
		// 계산할 숫자
		String num = br.readLine();
		// 결과
		int sum = 0;
		
		//N자릿수 만큼 for문 반복
		for (int i = 0; i < N; i++) {
			//charAt() : 문자의 아스키코드 값을 반환
			// '0' : 아스키코드 48임 
			// 숫자1의 아스키코드는 49이므로 1값을 얻기 위해 -48 또는 -'0' 필요
			sum += (num.charAt(i) - '0');
		}
		System.out.println(sum);

	}
}
