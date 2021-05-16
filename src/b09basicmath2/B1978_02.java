package b09basicmath2;

public class B1978_02 {
	
	// 소수를 구하는 알고리즘
	// 에라토스테네스의 체
	/*
	소수를 구하기 위한 최적화 알고리즘 '에라토스테네스의 체'
	N이하의 모든 소수를 구하기 위해 N이하의 숫자까지 자기자신의 배수를 
	모두 제거하는 알고리즘
	 */
	public static boolean[] prime;
	
	public static void main(String[] args) {
		
	}
	
	public static void make_prime(int N) {
		
		prime = new boolean[N + 1];	// 0 ~ N
 
		/*
		소수가 아닌 index = true
		소수인 index = false
		*/
		
		// 2 미만의 N 을 입력받으면 소수는 판별할 필요 없으므로 바로 return
		if(N < 2) {
			return;
		}
        
		prime[0] = prime[1] = true;
		
        
		// 제곱근 함수 : Math.sqrt()
		/*
		 숫자 16을 예로들면
		 1 * 16
		 2 * 8
		 4 * 4
		 8 * 2
		 16 * 1
		 
		 	--16의 제곱근인 4이후로는 같은 숫자가 반복됨을 확인할 수 있다.
		 */
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
        
			// 이미 체크된 배열이면 다음 반복문으로 skip
			if(prime[i]==true) {
				continue;
			}
        
			// i 의 배수들을 걸러주기 위한 반복문
			for(int j = i*i; j < prime.length; j = j+i) {
				prime[j] = true;
			}
		}
 
	}
 
}
