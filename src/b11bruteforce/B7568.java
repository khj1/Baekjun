package b11bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B7568 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		int[][] members = new int[n][2];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			members[i][0] = Integer.parseInt(st.nextToken());
			members[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<n; i++) {
			int rank = 1;
			int w1 = members[i][0];
			int h1 = members[i][1];
			for(int j=0; j<n; j++) {
				if(i == j) continue;
				int w2 = members[j][0];
				int h2 = members[j][1];
				if((w1 < w2 && h1 < h2))
					rank++;
			}
			sb.append(rank).append(" ");
		}
		System.out.println(sb);
	}
}
