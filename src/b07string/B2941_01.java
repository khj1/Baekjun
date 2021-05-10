package b07string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2941_01 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			int p = str.charAt(i);
			int len = str.length();
			
			if(p == 'c' && i < len - 1) {
				if(str.charAt(i+1) == '=') {
					i++;
				}
				else if(str.charAt(i+1) == '-') {
					i++;
				}
			}
			
			else if(p == 'd' && i < len - 1) {
				if(str.charAt(i+1) == 'z' && i < len - 2) {
					if(str.charAt(i+2) == '=') {
						i += 2;
					}
				}
				else if(str.charAt(i+1) == '-') {
					i++;
				}
			}
			
			else if(p == 'l' && i < len - 1) {
				if(str.charAt(i+1) == 'j') {
					i++;
				}
			}
			
			else if(p == 'n' && i < len - 1) {
				if(str.charAt(i+1) == 'j') {
					i++;
				}
			}
			
			else if(p == 's' && i < len - 1) {
				if(str.charAt(i+1) == '=') {
					i++;
				}
			}
			
			else if(p == 'z' && i < len - 1) {
				if(str.charAt(i+1) == '=') {
					i++;
				}
			}
			
			cnt++;
		}
		
		System.out.println(cnt);
	}

}
