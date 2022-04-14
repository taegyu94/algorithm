package algorithm.primenumber;

import java.util.LinkedList;

/*
 *  " N 보다 작은 자연수들로 모두 나누어 보기" 
 *    N 이하의 숫자들을 모두 검사하므로 시간복잡도는 O(N).
 */
public class PrimeNumber1 {

	private int n; // 판별할 숫자.
	private LinkedList<Integer> list;
	
	// 빈 생성
	public PrimeNumber1() {
		this.n = 0;
		this.list = null;
	}
	
	// setter, getter
	public void setN(int n) {
		this.n = n;
	}
	
	public int getN() {
		return this.n;
	}
	
	public String getList() {
		return this.list.toString();
	}
	
	// 소수이면 true, 아니면 false . 소수 판별 메서드.
	public boolean isPrime() {

		// 0, 1 소수 X 
		if(n < 2) {
			return false;
		}
		if(n == 2) {
			return true;
		}
		
		for(int i = 2 ; i < n ; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		// 검사를 통과하면 n 은 소수.
		return true;
	}
	
	// n 이하의 모든 소수를 구하는 메서드
	public void make_prime() {
		list = new LinkedList<>();
		
		if(n < 2) {
			list = null;
			return;
		}
		if(n == 2) {
			list.add(n);
			return;
		}
		
		for(int i = 2 ; i <= n ; i++) {
			int cnt = 0 ; 
			for(int j = 2 ; j < i ; j++) {
				if(i % j == 0) {
					cnt++;
					break;
				}
			}
			if(cnt == 0) {
				list.add(i);
			}
		}
	}
	
}
