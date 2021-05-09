package b07string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//자바의 replace() 메소드는 모든 old string을 대체한다.
public class B2941_02 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		String croatia[] = {"c=", "c-", "dz=", "d-","lj","nj", "s=","z="};
		
		for(int i = 0; i < 8 ; i++) {
			s = s.replace(croatia[i],"a");
		}
		System.out.println(s.length());
	}
}
