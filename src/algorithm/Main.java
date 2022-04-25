package algorithm;

import java.util.Scanner;

import algorithm.primenumber.PrimeNumber3;
import algorithm.sort.BubbleSort;
import algorithm.sort.HeapSort;
import algorithm.sort.InsertionSort;
import algorithm.sort.MergeSort;
import algorithm.sort.QuickSort;
import algorithm.sort.SelectionSort;
import algorithm.sort.ShellSort;

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
//		BubbleSort bs = new BubbleSort();
//		bs.setArrayRandom();
//		System.out.println(bs.getArray());
//		bs.bubbleSort();
//		System.out.println(bs.getArray());
		
//		// ShellSort
//		ShellSort ss = new ShellSort();
//		ss.setArrayRandom();
//		System.out.println(ss.getArray());
//		ss.shellSort();
//		System.out.println(ss.getArray());
		
		// HeapSort
//		HeapSort hs = new HeapSort();
//		hs.setArrayRandom();
//		System.out.println(hs.getArray());
//		hs.heapSort(1);
//		System.out.println(hs.getArray());
		
		//	MergeSort
//		MergeSort ms = new MergeSort();
//		ms.setArrayRandom();
//		System.out.println(ms.getArray());
//		ms.mergeSortDownTop(0, ms.getArraySize() - 1);
//		System.out.println(ms.getArray());
		
		//QuickSort
		QuickSort qs = new QuickSort();
		qs.setArrayRandom();
		System.out.println(qs.getArray());
		//qs.l_pivot_sort(0, qs.getArrayLength() - 1);
		//qs.r_pivot_sort(0, qs.getArrayLength()-1);
		qs.m_pivot_sort(0, qs.getArrayLength() - 1);
		System.out.println(qs.getArray());
	}

}
