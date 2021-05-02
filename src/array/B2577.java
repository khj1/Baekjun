package array;

import java.util.Scanner;

public class B2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int num1 = a * b * c;
		String num2 = Integer.toString(num1);
		
		int[] arr = new int[10];
		
		
		for(int i=0; i<num2.length(); i++) {
			arr[num2.charAt(i)-'0']++;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
