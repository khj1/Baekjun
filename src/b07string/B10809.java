package b07string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10809 {

	public static void main(String[] args) throws IOException{
		int[] arr = new int[26];
		for(int i=0; i<arr.length; i++)
			arr[i] = -1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		for(int i=0; i<str.length(); i++) {
			int a = str.charAt(i);
			if((a>='a' && a<='z') && arr[a-'a'] == -1)
				arr[a -'a'] = i;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int e: arr)
			sb.append(e).append(" ");
		
		System.out.println(sb);
		br.close();
	}
}
