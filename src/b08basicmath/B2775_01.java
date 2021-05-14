package b08basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2775_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));				
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[k+1][n];
			
			for(int a=0; a<k+1; a++) {
				int c =0;
				for(int b=0; b<n; b++) {
					if(a==0)
						arr[a][b] = b+1;
					else {
						c += arr[a-1][b];
						arr[a][b] = c;
					}
				}
			}
			
			System.out.println(arr[k][n-1]);
		}
	}

}
