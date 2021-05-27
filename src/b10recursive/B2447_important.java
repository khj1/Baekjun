package b10recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2447_important {
	static char[][] stars;
	
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		stars = new char[n][n];
		
		for(int i=0; i<n; i++) {
			Arrays.fill(stars[i], ' ');
		}
		
		stars(0, 0, n);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				sb.append(stars[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
	
	public static void stars(int x, int y, int n){
		if(n == 1) {
			stars[x][y]= '*';
			return;
		}
		else {
			int len = n/3;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(i == 1 && j == 1) {
						continue;
					}
					stars(x + (len * i), y + (len * j), len);
				}
			}
		}
	}
}
