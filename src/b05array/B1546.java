package b05array;

import java.util.Arrays;
import java.util.Scanner;

public class B1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[sc.nextInt()];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		Arrays.sort(arr);
		double max = arr[arr.length-1];	
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]/max*100;
		}
		
		System.out.println(sum/(arr.length));
	}

}
