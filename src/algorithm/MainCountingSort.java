package algorithm;

import algorithm.sort.CountingSort;

public class MainCountingSort {
	public static void main(String[] args) {
		CountingSort cs = new CountingSort();
		
		cs.setRandomArray();
		cs.countingSort();
		
		System.out.println(cs.getArray());
		System.out.println(cs.getResult());
		
	}
}
