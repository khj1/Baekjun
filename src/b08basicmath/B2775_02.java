package b08basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2775_02 {

	public static void main(String[] args) throws IOException{
		int[][] arr = new int[15][15];
			
		for (int i = 0; i < 15; i++) {
			arr[0][i] = i;
			arr[i][1] = 1;
		}

		for (int i = 1; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				arr[i][j] = arr[i][j-1]+arr[i-1][j];
			}
		}

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int t =Integer.parseInt(bf.readLine()),k,n;
		for (int i = 0; i < t; i++) {
			k = Integer.parseInt(bf.readLine());
			n = Integer.parseInt(bf.readLine());
			System.out.println(arr[k][n]);
		}
		
	}

}
