package b05array;

import java.util.Scanner;

public class B8958 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[sc.nextInt()];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		
		sc.close();
		
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			int a = 0;
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O')
					a++;
				else
					a = 0;
				sum += a;
			}
			System.out.println(sum);
		}
	}
}
