package pack.test.date220223;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String str;

		while( (str = br.readLine()) != null ){
			st = new StringTokenizer(str, " ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			sb.append(a + b + "\n");
		}
		System.out.println(sb);
		//EOF(End Of File)을 처리하는 방법
		/*
		 * 윈도우 : ctrl+z
		 * 리눅스 : ctrl+d 또는 정수가 아닌 문자열 입력해 InputMismathException유도
		 * */
	}
}