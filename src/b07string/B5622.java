package b07string;

import java.io.IOException;

public class B5622 {

	public static void main(String[] args) throws IOException{
		int t = 0;
		int p = System.in.read();
		while(p > 64) {
			if(p <= 67)
				t += 3;
			else if(p <= 70)
				t += 4;
			else if(p <= 73)
				t += 5;
			else if(p <= 76)
				t += 6;
			else if(p <= 79)
				t += 7;
			else if(p <= 83)
				t += 8;
			else if(p <= 86)
				t += 9;
			else if(p <= 100)
				t += 10;
			p = System.in.read();
		}
		System.out.println(t);
	}

}
