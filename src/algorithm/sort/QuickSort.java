package algorithm.sort;

import java.util.Arrays;

/*
 * QuickSort
 * O(NlogN) 의 시간복잡도를 갖는다.
 * 공간복잡도는 logN
 */
public class QuickSort {

	private static final int DEFAULT_ARRAY_LENGTH = 100;
	
	private int[] array;
	
	public QuickSort() {
		this.array = new int[DEFAULT_ARRAY_LENGTH];
	}
	
	public QuickSort(int[] a) {
		this.array = a;
	}
	
	public void setArray(int[] a) {
		this.array = null;
		this.array = a;
	}
	
	public void setArrayRandom() {
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = (int)(Math.random() * array.length);
		}
	}
	
	public void setArrayIndex(int index , int value) {
		if(index < 0 || index >= array.length) {
			throw new IndexOutOfBoundsException();
		}
		array[index] = value;
	}
	
	public int getArrayLength() {
		return array.length;
	}
	
	public String getArray() {
		return Arrays.toString(array);
	}
	
	// l_pivot_sort
	public void l_pivot_sort(int lo, int hi) {
		if(lo >= hi)
			return;
		
		int pivot = lpartition(lo,hi);
		
		l_pivot_sort(lo,pivot - 1);
		l_pivot_sort(pivot+1,hi);
	}
	
	private int lpartition(int left, int right) {
		int lo = left;
		int hi = right;
		int pivot = array[left];
		
		while(lo < hi) {
			while(array[hi] > pivot && hi > lo) {
				hi--;
			}
			while(array[lo] <= pivot && lo < hi) {
				lo++;
			}
			swap(hi,lo);
		}
		swap(lo,left);
		return lo;
	}
	
	// r_pivot_sort
	public void r_pivot_sort(int lo, int hi) {
		if(lo >= hi)
			return;
		int pivot = rpartition(lo, hi);
		r_pivot_sort(lo,pivot-1);
		r_pivot_sort(pivot+1,hi);
	}
	
	private int rpartition(int left, int right) {
		int lo = left;
		int hi = right;
		int pivot = array[right];
		
		while(lo < hi) {
			while(array[lo] < pivot && lo < hi) {
				lo++;
			}
			while(array[hi] >= pivot && lo < hi) {
				hi--;
			}
			
			swap(lo,hi);
		}
		swap(right,hi);
		return hi;
	}
	
	// m_pivot_sort
	public void m_pivot_sort(int lo, int hi) {
		if(lo >= hi)
			return;
		int pivot = mpartition(lo,hi);
		m_pivot_sort(lo,pivot);
		m_pivot_sort(pivot+1,hi);
	}
	
	private int mpartition(int left, int right) {
		int lo = left - 1;
		int hi = right + 1;
		int pivot = array[(left+right)/2];
		
		while(true) {
			do {
				lo++;
			}while(array[lo] < pivot);
			
			do {
				hi--;
			}while(array[hi] > pivot && lo <= hi);
			
			if(lo >= hi)
				return hi;
			
			swap(lo,hi);
		}
		
	}
	
	private void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
