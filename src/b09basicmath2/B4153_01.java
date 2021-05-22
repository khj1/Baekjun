// 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
package b09basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4153_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a+b+c == 0)
				break;
			
			double r = -1;
			
			int max = Math.max(Math.max(a, b), c);
			if(max == a)
				r = Math.pow(a, 2) - Math.pow(b, 2) - Math.pow(c, 2);
			else if(max == b)
				r = Math.pow(b, 2) - Math.pow(a, 2) - Math.pow(c, 2);
			else
				r = Math.pow(c, 2) - Math.pow(a, 2) - Math.pow(b, 2);
			
			if(r == 0)
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}
}
