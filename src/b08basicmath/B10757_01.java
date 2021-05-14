package b08basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 숫자를 append하고 결과값을 reverse 해주는 것보다 배열을 활용하는 것이 더 빠르다.
public class B10757_01 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		String a = st.nextToken();
		String b = st.nextToken();
		int e = 0;
		
		while(a != "" || b != "") {
			int num1 =0;
			int num2 =0;
			if(a != "") {
				num1 = a.charAt(a.length()-1) - '0';
				a = a.substring(0, a.length()-1);
			}
			if(b != "") {
				num2 = b.charAt(b.length()-1) - '0';
				b = b.substring(0, b.length()-1);
			}
			int sum = num1 + num2 + e;
			e = sum/10;
			sb.append(sum%10);
		}
		if(e == 1)
			sb.append(e);
		System.out.println(sb.reverse());
	}
}
