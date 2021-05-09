package b07string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i =0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			StringBuilder sb = new StringBuilder();
			int cnt =Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			for(int j = 0; j<str.length(); j++) {
				for(int k=0; k<cnt; k++) {
					sb.append(str.charAt(j));
				}
			}
			System.out.println(sb);
		}
		br.close();
	}
}
