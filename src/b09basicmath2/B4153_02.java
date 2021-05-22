// 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
package b09basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B4153_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String s = br.readLine();
			if(s.equals("0 0 0"))
				break;
			
			StringTokenizer st = new StringTokenizer(s);
			
			int[] t = new int[3];
			t[0] = Integer.parseInt(st.nextToken());
			t[1] = Integer.parseInt(st.nextToken());
			t[2] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(t);
			
			boolean r = t[2]*t[2] == t[1]*t[1] + t[0]*t[0];
			
			if(r)
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}
}
