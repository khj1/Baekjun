package b09basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B1002 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			ArrayList<Integer> x = new ArrayList<Integer>();
			ArrayList<Integer> y = new ArrayList<Integer>();
			
			for(int a=0; a<=r1; a++) {
				for(int b=0; b<=r1; b++) {
					if(Math.pow(a-x1, 2) + Math.pow(b-y1, 2) == Math.pow(r1, 2)) {
						x.add(a); y.add(b);
					}
				}
			}
			
			int cnt = 0;
			
			for(int a=0; a<x.size(); a++) {
				if(Math.pow(x.get(a)-x2, 2) + Math.pow(y.get(a)-y2, 2) == Math.pow(r2, 2)) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
		}
	}

}
