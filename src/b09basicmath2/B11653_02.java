package b09basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11653_02 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(in.readLine());
		
		for(int i=2;i<= Math.sqrt(N); i++) {
			while(N%i == 0) {
				System.out.println(i);
				N /= i;
			}
		}
		if(N != 1) {
			System.out.println(N);
		}

	}

}
