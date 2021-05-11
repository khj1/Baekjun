package b08basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2292_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a = 2;
		int b = 6;
		int cnt = 2;
		
		while(true) {
			if(n == 1) {
				System.out.println(1);
				break;
			}
			else {
				if(n >= a && n < a+b) {
					System.out.println(cnt);
					break;
				}
				else {
					cnt++;
					a = a + b;
					b = b + 6;
				}
			}
		}
	}
}
