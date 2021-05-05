package b06method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B1065_2 {
	
	public static int hansu(int range) {
		if(range < 100)
			return range;
		
		int cnt = 99;
		for(int i=100; i<=range; i++) {
			int num = i;
			
			int a = num % 10;
			int b = (num / 10) % 10;
			int c = num / 100;
			
			if(b-a == c-b)
				cnt++;
		}
		
		return cnt;
	}
			

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(hansu(Integer.parseInt(br.readLine())));
	}

}
