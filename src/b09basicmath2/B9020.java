package b09basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9020 {
	public static boolean[] primes;
	public static final int MAX_NUM = 10000;
	
	public static void getPrime() {
		primes[0] = primes[1] = true;
		
		for(int i=2; i<Math.sqrt(MAX_NUM); i++) {
			for(int j=i*i; j<MAX_NUM+1; j+=i) {
				primes[j] = true;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		primes = new boolean[MAX_NUM + 1];
		getPrime();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			for(int j=n/2; j>=2; j--) {
				if(!primes[j] && !primes[n-j]) {
					sb.append(j).append(' ').append(n-j).append('\n');
					break;
				}
			}
		}
		br.close();
		System.out.println(sb);
	}
}
