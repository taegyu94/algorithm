package algorithm;

import java.util.Scanner;

import algorithm.primenumber.PrimeNumber1;
import algorithm.primenumber.PrimeNumber2;
import algorithm.primenumber.PrimeNumber3;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		System.out.println("방법1-------------------------");
//		long beforeTime = System.currentTimeMillis();
//		PrimeNumber1 prime = new PrimeNumber1();
//		prime.setN(n);
////		if(n < 0) {
////			System.out.println("음수를 입력했습니다.");
////			return;
////		}
////		if(prime.isPrime()) {
////			System.out.println(prime.getN()+ "은 소수 입니다.");
////		}
////		else {
////			System.out.println(prime.getN() + "은 소수가 아닙니다.");
////		}
//		
//		prime.make_prime();
//		//System.out.println(prime.getList());
//		
//		long afterTime = System.currentTimeMillis();
//		long time = afterTime - beforeTime;
//		System.out.println("걸린시간 : " + time + "ms");
//		
//		/////////////////
//		System.out.println("방법2-------------------------");
//		beforeTime = System.currentTimeMillis();
//		PrimeNumber2 prime2 = new PrimeNumber2();
//		prime2.setN(n);
//		
////		if(n < 0) {
////			System.out.println("음수를 입력했습니다.");
////			return;
////		}
////		if(prime.isPrime()) {
////			System.out.println(prime.getN()+ "은 소수 입니다.");
////		}
////		else {
////			System.out.println(prime.getN() + "은 소수가 아닙니다.");
////		}
//		
//		prime2.make_prime();
//		//System.out.println(prime2.getList());
//		
//		afterTime = System.currentTimeMillis();
//		time = afterTime - beforeTime;
//		System.out.println("걸린시간 : " + time + "ms");
		
		///////////////
		System.out.println("방법3-------------------------");
		long beforeTime = System.currentTimeMillis();
		PrimeNumber3 prime3 = new PrimeNumber3();
		
		prime3.setN(n);
		
		prime3.make_prime();
		//System.out.println(prime3.getPrime());
		
		long afterTime = System.currentTimeMillis();
		long time = afterTime - beforeTime;
		System.out.println("걸린시간 : " + time + "ms");
	}

}
