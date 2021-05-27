package b11bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2798 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] numbers = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++)
			numbers[i] = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		for(int a=0; a<N-2; a++) {
			for(int b=a+1; b<N-1; b++) {
				for(int c=b+1; c<N; c++) {
					int temp = numbers[a] + numbers[b] + numbers[c];
					if(temp > sum && temp <= M) {
						sum = temp;
						if(sum == M) {
							System.out.println(M);
							return;
						}
					}
				}
			}
		}
		System.out.println(sum);
	}
}
