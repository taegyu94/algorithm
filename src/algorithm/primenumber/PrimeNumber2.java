package algorithm.primenumber;

import java.util.LinkedList;

/*
 * " √N 이하의 자연수들로 모두 나눠본다. "
 */
public class PrimeNumber2 {

	private int n;
	private LinkedList<Integer> list;
	
	public PrimeNumber2() {
		this.n = 0;
		this.list = null;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public int getN() {
		return n;
	}
	
	public String getList() {
		return list.toString();
	}
	
	public boolean isPrime() {
		if(n < 2) {
			return false;
		}
		if(n == 2 ) {
			return true;
		}
		
		for(int i = 2 ; i <= Math.sqrt(n) ; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// n이하의 모든 소수 구하는 메서드 
	public void make_prime() {
		list = new LinkedList<>();
		if(n < 2) {
			return;
		}
		if(n == 2) {
			list.add(n);
			return;
		}
		for(int i = 2 ; i <= n ; i++) {
			int cnt = 0;
			for(int j = 2 ; j <= Math.sqrt(i) ; j++) {
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
