package b11bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018_important {
	public static char[][] board; 

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		board = new char[row][col];
		
		for(int i=0; i<row; i++) {
			board[i] = br.readLine().toCharArray();
		}
		
		int min = 64;
		for(int a=0; a<row-7; a++) {
			for(int b=0; b<col-7; b++) {
				min = Math.min(getCount(a, b), min); 
			}
		}
		System.out.println(min);
	}

	public static int getCount(int a, int b) {
		int cnt = 0;
		for(int i=a; i<a+8; i++) {
			for(int j=b; j<b+8; j++) {
				if(i % 2 == 0) {
					if(j % 2 == 0 && board[i][j] != 'B') {
						cnt++;
					}
					else if(j % 2 == 1 && board[i][j] != 'W') {
						cnt++;
					}
				}
				else {
					 if(j % 2 == 1 && board[i][j] != 'B') {
						 cnt++;
					}
					else if(j % 2 == 0 && board[i][j] != 'W') {
						cnt++;
					}
				}
			}
		}
		
		return Math.min(cnt, 64-cnt);
	}
}
