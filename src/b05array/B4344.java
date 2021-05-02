package b05array;

import java.util.Scanner;

public class B4344 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		int sum;
		int cnt;
		
		int repeat = sc.nextInt();
		for(int i=0; i<repeat; i++) {
			sum=0;
			cnt=0;
			
			arr = new int[sc.nextInt()];
			for(int j=0; j<arr.length; j++) {
				arr[j] = sc.nextInt();
				sum+=arr[j];
			}
			double avg = sum/(arr.length);
			for(int k=0; k<arr.length; k++) {
				if(arr[k] > avg)
					cnt++;
			}
			
			System.out.printf("%.3f%%", (double)cnt/arr.length * 100);
			System.out.println();
		}
		sc.close();
	}

}
