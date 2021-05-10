package b07string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1316_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			String p = br.readLine();
			StringBuilder sb = new StringBuilder();
			sb.append(p.charAt(0));
			for(int j=0; j<p.length()-1; j++) {
				if(p.charAt(j) != p.charAt(j+1))
					sb.append(p.charAt(j+1));
			}
			String c = sb.toString();
			
			int flag =0;
			for(int a=0; a<c.length()-1; a++) {
				for(int b=a+1; b<c.length(); b++) {
					if(c.charAt(a) == c.charAt(b)) {
						flag = 1;
						break;
					}
				}
				if(flag == 1)
					break;
			}
			if(flag == 0)
				cnt++;
		}
		System.out.println(cnt);
	}
}
