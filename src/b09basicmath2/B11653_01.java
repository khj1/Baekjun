package b09basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
 */
public class B11653_01{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=2; i<=n; i++) {
			if(n%i == 0) {
				System.out.println(i);
				n /= i;
				i--;
			}
		}
	}
}
