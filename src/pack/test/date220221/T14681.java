package pack.test.date220221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T14681 {

	public static void main(String[] args) throws IOException {

		//Scanner보다 빠름. Butn integer로 변환 필요
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		if (x > 0 && y > 0) {
			System.out.println(1);
		} 
		else if (x < 0 && y > 0) {
			System.out.println(2);
		} 
		else if (x < 0 && y < 0) {
			System.out.println(3);
		} 
		else if (x > 0 && y < 0) {
			System.out.println(4);
		}

	}

}
