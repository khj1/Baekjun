package b07string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B11720 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		String num = br.readLine();
		int result = 0;
		
		for(int i=0; i<size; i++) {
			result = result + num.charAt(i) - '0';
		}
		System.out.println(result);
	}

}
