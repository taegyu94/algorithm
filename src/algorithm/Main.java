package algorithm;

import java.util.Scanner;

import algorithm.primenumber.PrimeNumber3;
import algorithm.sort.BubbleSort;
import algorithm.sort.InsertionSort;
import algorithm.sort.SelectionSort;

public class Main {

	public static void main(String[] args) {
		/////////////// primenumber
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//
//		System.out.println("방법3-------------------------");
//		long beforeTime = System.currentTimeMillis();
//		PrimeNumber3 prime3 = new PrimeNumber3();
//		
//		prime3.setN(n);
//		
//		prime3.make_prime();
//		//System.out.println(prime3.getPrime());
//		
//		long afterTime = System.currentTimeMillis();
//		long time = afterTime - beforeTime;
//		System.out.println("걸린시간 : " + time + "ms");
		
		////////CountingSort
//		CountingSort cs = new CountingSort();
//		
//		cs.setRandomArray();
//		cs.countingSort();
//		
//		System.out.println(cs.getArray());
//		System.out.println(cs.getResult());
		
		///////////SelectionSort
//		SelectionSort sels = new SelectionSort();
//		sels.setArrayRandom();
//		System.out.println(sels.getArray());
//		sels.selectionSort();
//		System.out.println(sels.getArray());
		
		//// InsertionSort
//		InsertionSort is = new InsertionSort();
//		is.setArrayRandom();
//		System.out.println(is.getArray());
//		is.insertionSort();
//		System.out.println(is.getArray());
		
		// BubbleSort
		BubbleSort bs = new BubbleSort();
		bs.setArrayRandom();
		System.out.println(bs.getArray());
		bs.bubbleSort();
		System.out.println(bs.getArray());
	}

}
