package b11sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class B2750 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int[] arr = new int[t];
		for(int i=0; i<t; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		for(int i=0; i<t; i++) {
			if(i==t-1)
				sb.append(arr[i]);
			else 
				sb.append(arr[i]).append("\n");
		}
		
		System.out.println(sb);
	}
}