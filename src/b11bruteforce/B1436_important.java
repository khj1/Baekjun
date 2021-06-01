package b11bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1436_important {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		int num = 0;
		int count = 0;
		int i = 666;
		while(t != count) {
			if(String.valueOf(i).contains("666")) {
				num = i;
				count ++;
			}
			i++;
		}
		System.out.println(num);
	}
}
