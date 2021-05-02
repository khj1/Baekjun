package b05array;

import java.util.Arrays;
import java.util.Scanner;

public class B2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[9];
		int[] arr2 = new int[9];
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=sc.nextInt();
			arr2[i]=arr1[i];
		}
		
		Arrays.sort(arr2);
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] == arr2[arr1.length-1]) {
				int index = i+1;
				System.out.println(arr2[arr1.length-1] + "\n" + (i+1));
				break;
			}
		}
	}
}
