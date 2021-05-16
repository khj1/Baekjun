package b09basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2581 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int start = Integer.parseInt(br.readLine());
		int end = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int min = -1;
		int cnt = 0;
		for(int i=start; i<end+1; i++) {
			int m = 0;
			for(int j=1; j<=i; j++) {
				if(m>2)
					break;
				if(i%j==0)
					m++;
			}
			if(m==2) {
				sum+=i;
				if(min == -1)
					min=i;
			}
		}
		if(min == -1) {
			System.out.println(min);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
