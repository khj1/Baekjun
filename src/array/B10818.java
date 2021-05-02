package array;

import java.util.Arrays;
import java.util.Scanner;

public class B10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		int[] arr1 = new int[arrSize];
		
		for(int i=0; i < arrSize; i++) {
			arr1[i] = sc.nextInt();
		}
		
		Arrays.sort(arr1);
		
		System.out.println(arr1[0] + " " + arr1[arrSize-1]);
	}
}
