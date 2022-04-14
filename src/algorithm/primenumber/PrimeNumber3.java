package algorithm.primenumber;


/*
 *  에라토스테네스의 체
 *  " k=2 부터 √N 이하까지 반복하여 자연수들 중 k를 제외한 k의 배수들을 제외시킨다"
 */
public class PrimeNumber3 {
	
	private int n;
	private boolean[] prime;
	
	public PrimeNumber3() {
		this.n = 0;
		prime = null;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getN() {
		return n;
	}
	public String getPrime() {
		if(n < 2) {
			return "[]";
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0 ; i < prime.length ; i++) {
			if(!prime[i]) {
				sb.append(i).append(", ");
			}
		}
		return sb.toString().substring(0, sb.length()-2) + "]";
	}
	
	public void make_prime() {
		prime = new boolean[n+1];  // 0~N
	
		if(n < 2) {
			return;
		}
		
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2 ; i <= Math.sqrt(n) ; i++) {
			if(prime[i] == true) continue;
			for(int j = i*i ; j < prime.length ; j = j+i) {
				prime[j] = true;
			}
		}
		
	}
	

}
