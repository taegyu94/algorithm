package algorithm.sort;

import java.util.Arrays;

/*
 * MergeSort
 */
public class MergeSort {

	private static final int DEFAULT_ARRAY_LENGTH = 100;
	
	private int[] array;
	private int[] tempArray;
	
	public MergeSort() {
		this.array = new int[DEFAULT_ARRAY_LENGTH];
		this.tempArray = new int[DEFAULT_ARRAY_LENGTH];
	}
	
	public MergeSort(int[] a) {
		this.array = a;
		this.tempArray = new int[a.length];
	}
	
	public void setArrayRandom() {
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = (int)(Math.random()*array.length);
		}
	}
	
	public void setArrayIndex(int index , int value) {
		if(index < 0 || index >= array.length) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public String getArray() {
		return Arrays.toString(array);
	}
	
	public int getArraySize() {
		return array.length;
	}
	
	public void mergeSortTopDown(int left, int right) {
		if(left == right)		// 부분리스트의 길이가 1
			return;
		
		int mid = (left+right) / 2;
		
		mergeSortTopDown(left,mid); // 왼쪽 부분 리스트
		mergeSortTopDown(mid+1, right);	// 오른쪽 부분 리스트
		
		merge(left,mid,right);
	}
	
	public void mergeSortDownTop(int left, int right) {
		for(int size = 1 ; size <= right ; size += size) {
			for(int l = 0 ; l <= right - size ; l += (2*size)) {
				int row = l;
				int mid = l + size - 1;
				int high = Math.min(l+(2*size)-1, right);
				merge(row,mid,high);
			}
		}
	}
	
	private void merge(int left, int mid, int right) {
		int l = left;
		int r = mid + 1;
		int idx = left;
		
		while(l <= mid && r <= right) {
			if(array[l] <= array[r]) {
				tempArray[idx] = array[l];
				idx++;
				l++;
			}
			else {
				tempArray[idx] = array[r];
				idx++;
				r++;
			}
		}
		if(l > mid) {
			while(r <= right) {
				tempArray[idx] = array[r];
				idx++;
				r++;
			}
		}
		else {
			while(l <= mid) {
				tempArray[idx] = array[l];
				idx++;
				l++;
			}
		}
		for(int i = left ; i <= right ; i++) {
			array[i] = tempArray[i];
		}
	}
}
