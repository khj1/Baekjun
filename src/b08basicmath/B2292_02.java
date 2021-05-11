package b08basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2292_02 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int target_num = Integer.parseInt(br.readLine());
		
		int honeynum =0;
		int value=1;
		int i;
		
		for( i=1; value < target_num; i++){
			honeynum = 6 * i;
			value = value + honeynum;
		}
		
		System.out.println(i);
	}

}
