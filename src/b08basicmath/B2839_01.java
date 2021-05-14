package b08basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839_01 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sugar = Integer.parseInt(br.readLine());
		int e = 0;
		while(sugar > 0) {
			if((sugar%5)%3 != 0) {
				sugar -= 3;
				e++;
			}
			else {
				e += sugar/5;
				e += (sugar%5)/3;
				sugar -= (sugar/5)*5;
				sugar -= (sugar/3)*3;
				break;
			}
		}
		if(sugar != 0)
			System.out.println(-1);
		else
			System.out.println(e);
	}
}
