package b09basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class B1978_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt = 0;
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(st.nextToken());
			int m = 0;
			for(int j=1; j<=n; j++) {
				if(m>2)
					break;
				if(n%j==0)
					m++;
			}
			if(m==2)
				cnt++;
		}
		System.out.println(cnt);
	}

}
