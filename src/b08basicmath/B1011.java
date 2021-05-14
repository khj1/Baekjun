package b08basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1011 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int len = y - x;
			int p = 0;
			int q = 0;
			int cnt =0;
			
			while(len > 0) {
				if(len >= p+q+2) {
					p++;
					q++;
					len -= p+q;
					cnt += 2;
				}
				else if(len > p+1) {
					cnt += 2;
					break;
				}
				else if(len == p+1) {
					cnt++;
					break;
				}
				else {
					cnt++;
					break;
				}
			}
			System.out.println(cnt);
		}
	}
}
