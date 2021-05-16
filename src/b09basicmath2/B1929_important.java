package b09basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929_important {

	static boolean[] primes;
	static int N;
	
	public static void getPrime() {
		primes[0] = true;
		primes[1] = true;
		
		for(int i=2; i<Math.sqrt(N); i++) {
			for(int j= i*i; j<N+1; j+=i) {
				primes[j] = true;
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		primes = new boolean[N+1];
		
		getPrime();
		
		for(int i=M; i<N+1; i++) {
			if(primes[i] == false)
				sb.append(i).append('\n');
		}
		System.out.println(sb);
	}
}
