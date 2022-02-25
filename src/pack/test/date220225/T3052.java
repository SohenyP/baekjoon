/*
 * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
 * 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 
 * 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 * 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 
 * 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
*/

package pack.test.date220225;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class T3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//HashSet은 애초에 중복값을 허용하지 않는다! 따로 for문 돌리면서 체크할 필요없이 HashSet으로 뚜둥!
		HashSet<Integer> hs = new HashSet<Integer>();
		
		
		for (int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		}
		
		System.out.println(hs.size());
	}
}
