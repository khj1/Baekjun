package b07string;

import java.io.IOException;

public class B1157_02 {
	public static void main(String[] args) throws IOException{
		int b[] = new int[26];
		int c= System.in.read();
		while(c>64) {
			if(c<91) {
				b[c-65]++;
			} else {
				b[c-97]++;
			}
			c = System.in.read();
		}
		
		int max=-1;
		int maxN=0;
		for(int i=0; i<b.length; i++) {
			if(b[i]>max) {
				max=b[i];
				maxN=i;
			} else if(b[i] == max) {
				maxN=-2;
			}
		}
		System.out.println((char)(maxN+65));
	}
}
