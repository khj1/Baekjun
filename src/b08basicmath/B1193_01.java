package b08basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1193_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i=1;
		int sum = 0;
		while(true) {
			sum += i;
			if(sum >= n)
				break;
			i++;
		}
		int p = sum-n;
		if(i%2 ==0) {
			System.out.println((i-p) + "/" + (1+p));
		}
		else {
			System.out.println((1+p) + "/" + (i-p));
		}
	}

}
