package b06method;

import java.util.HashSet;

public class B4673 {
	static HashSet<Integer> set = new HashSet<>();
	
	public static void selfNumber() {
		for(int i=1; i<10000; i++) {
			if(i<10)
				set.add(i+ i%10);
			if(i<100)
				set.add(i+ i/10 + i%10);
			if(i<1000)
				set.add(i
						+ i/100
						+ (i-(i/100)*100)/10 
						+ i%10);
			if(i<10000)
				set.add(i
						+ i/1000
						+ (i-(i/1000)*1000)/100 
						+ ((i-(i/1000)*1000)-((i-(i/1000)*1000)/100)*100)/10
						+ i%10);
		}
	}
	
	public static void findSelfNumber() {
		for(int i=1; i<10000; i++) {
			if(!set.contains(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		selfNumber();
		findSelfNumber();
	}
}
