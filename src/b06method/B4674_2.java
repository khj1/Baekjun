package b06method;

public class B4674_2 {
	
	
	public static void main(String[] args) {
		boolean[] arr = new boolean[10000];
		
		for(int i=0; i<10000; i++) {
			if(self(i) < 10000) {
				arr[self(i)] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<10000; i++) {
			if(!arr[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb.toString());
	}

	private static int self(int num) {
		int sum = num;
		while(num != 0) {
			sum = sum + num%10;
			num = num / 10;
		}
		return sum;
	}
}
