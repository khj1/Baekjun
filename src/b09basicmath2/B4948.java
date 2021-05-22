package b09basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4948 {

	public static boolean[] primes;
	public static final int MAX_NUM = 123456 * 2;
	
	public static void getPrime() {
		primes[0] = true;
		primes[1] = true;
		for(int i=2; i<Math.sqrt(MAX_NUM); i++) {
			for(int j=i*i; j<=MAX_NUM; j+=i) {
				primes[j] = true;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		primes = new boolean[MAX_NUM + 1];
		getPrime();
		int N = Integer.parseInt(br.readLine());
		while(N>0) {
			int cnt = 0;
			for(int i=N+1; i<=N*2; i++) {
				if(!primes[i]) {
					cnt++;
				}
			}
			sb.append(cnt).append('\n');
			N = Integer.parseInt(br.readLine());
		}
		System.out.println(sb);
	}

}
