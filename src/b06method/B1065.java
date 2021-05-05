package b06method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B1065 {
	
	public static void hansu(int range) {
		ArrayList<Integer> ele;
		ArrayList<Integer> diff;
		int cnt = 0;
		
		for(int i=1; i<=range; i++) {
			boolean flag = false;
			ele  = new ArrayList<Integer>();
			diff = new ArrayList<Integer>();
			
			if(i < 100) {
				cnt ++;
			}
			else {
				int num = i;
				while(num != 0) {
					ele.add(num%10);
					num = num / 10;
				}
				
				for(int j=0; j<ele.size()-1; j++) {
					diff.add(ele.get(j+1) - ele.get(j));
				}
				
				for(int e: diff) {
					if(e != diff.get(0)) {
						flag = true;
						break;
					}
				}
				
				if(flag == false)
					cnt ++;
				
			}
		}
		System.out.println(cnt);
	}
			

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		hansu(Integer.parseInt(br.readLine()));
	}

}
