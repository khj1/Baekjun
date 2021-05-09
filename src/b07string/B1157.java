package b07string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157 {

	public static void main(String[] args) throws IOException{
		int[] alphas = new int[26];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		for(int i=0; i<str.length(); i++) {
			alphas[str.charAt(i) - 'A']++;
		}
		int max = alphas[0];
		int index = 0;
		int cnt = 0;
		for(int i=1; i<alphas.length; i++) {
			if(max < alphas[i]) {
				max = alphas[i];
				index = i;
				cnt =0;
			}
			else if(max == alphas[i])
				cnt++;
		}
		if(cnt != 0)
			System.out.println('?');
		else
			System.out.println((char)(index + 'A'));
	}
}
