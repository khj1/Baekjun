package b07string;

import java.io.*;

class B1316_02 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;

		for(int i = 0; i < N; i++){
			int[] ar = new int[26];
			String str = br.readLine();
			for(int j = 0; j < str.length(); j++){
				int n = str.charAt(j);
				if(ar[n - 97] == 0)
					ar[n - 97]++;
				else
					if(str.charAt(j - 1) == str.charAt(j))
						ar[n - 97]++;
					else 
						break;
				if(j == str.length() - 1)
					cnt++;
			}
		}
		System.out.print(cnt);
	}
}
