package b10recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10870 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(p(Integer.parseInt(br.readLine())));
	}
	
	public static int p(int n) {
		if(n == 1) {
			return 1;
		}
		if(n == 0)
			return 0;
		return p(n-1) + p(n-2);
	}
}
