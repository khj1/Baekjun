package b06method;

import java.util.ArrayList;

public class B1065 {
	public boolean[] arr;
	ArrayList<Integer> ele;
	
	public int hansu(int range) {
		arr = new boolean[range];
		ele  = new ArrayList<Integer>();
		
		for(int i=1; i<=range; i++) {
			if(i < 100) {
				arr[i] = true;
			}
			else {
				int num = i;
				while(num != 0) {
					ele.add(num%10);
					num = num / 10;
				}
				for(int i=0; i<ele.size())
			}
		}
	}

	public static void main(String[] args) {
		
	}

}
