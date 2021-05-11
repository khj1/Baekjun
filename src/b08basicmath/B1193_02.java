package b08basicmath;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1193_02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();

		int n = Integer.parseInt(br.readLine());
		int a = 1;
		
		while(n > a) {
			n -= a++;
		}
		
		if(a % 2 == 0) {
			sb.append(n).append("/").append(a+1 -n);			
		}else {
			sb.append(a+1 -n).append("/").append(n);
		}
		
		bw.write(sb.toString());		
		bw.flush();
		
		br.close();
		bw.close();	
	}
}
