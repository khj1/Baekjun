package b07string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908_01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int [2];
		for(int j=0; j<arr.length; j++) {
			String strA = st.nextToken();
			int a = 0;
			for(int i=0; i<3; i++) {
				a += (strA.charAt(i) - '0') * Math.pow(10, i);
			}
			arr[j] = a;
		}
		if(arr[0] > arr[1])
			System.out.println(arr[0]);
		else
			System.out.println(arr[1]);
	}
}
