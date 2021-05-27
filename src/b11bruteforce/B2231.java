package b11bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int l = s.length();
		int n = Integer.parseInt(s);
		int c = n;
		for(int i=n-(l*9); i<n; i++) {
			int k = i;
			int sum = k;
			while(k/10 != 0) {
				sum += k%10;
				k /= 10;
			}
			sum += k;
			if(sum == n && i < c)
				c = i;
		}
		
		if(c == n)
			System.out.println(0);
		else 
			System.out.println(c);
	}

}
