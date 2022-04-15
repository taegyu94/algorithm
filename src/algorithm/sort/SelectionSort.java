package algorithm.sort;

import java.util.Arrays;

/*
 * 선택 정렬 (Selection Sort)
 * 선택 정렬은 말 그대로 현재 위치에 들어갈 데이터를 찾아 선택하는 알고리즘.
 * 기본적으로 선택정렬은 O(N2) 의 시간복잡도(time complexity)를 보인다.
 *  추가적인 메모리소비는 적다. 
 */

public class SelectionSort {

	private static final int DEFAULT_ARRAY_LENGTH = 100;
	
	private int[] array;
	
	public SelectionSort() {
		this.array = new int[DEFAULT_ARRAY_LENGTH];
	}
	
	public SelectionSort(int[] a) {
		this.array = a;
	}
	
	public void setArray(int[] a) {
		this.array = a;
	}
	
	public void setArrayRandom() {
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = (int)(Math.random()*array.length);
		}
	}
	
	public String getArray() {
		return Arrays.toString(array);
	}
	
	public void selectionSort() {
		for(int i = 0 ; i < array.length - 1 ; i++) {
			int min = i;
			for(int j = i + 1 ; j < array.length ; j++) {
				if(array[min] > array[j]) {
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}
}
