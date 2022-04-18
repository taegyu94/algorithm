package algorithm.sort;

import java.util.Arrays;


/*
 * BubbleSort(버블 정렬)
 *  두 개의 인접한 원소를 비교하여 정렬하는 방식
 *   정렬방법
 *	1. 앞에서부터 현재 원소와 바로 다음의 원소를 비교한다.
 *	2. 현재 원소가 다음 원소보다 크면 원소를 교환한다.
 *	3. 다음 원소로 이동하여 해당 원소와 그 다음원소를 비교한다.
 *
 * 시간복잡도 : 평균 O(n^2)
 */
public class BubbleSort {

	private static final int DEFAULT_ARRAY_LENGTH = 100;
	
	private int[] array;
	
	public BubbleSort() {
		this.array = new int[DEFAULT_ARRAY_LENGTH];
	}
	
	public BubbleSort(int[] a) {
		this.array = a;
	}
	
	public void setArrayRandom() {
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = (int)(Math.random() * array.length);
		}
	}
	
	public void setArrayIndex(int index, int value) {
		if(index < 0 || index >= array.length) {
			throw new IndexOutOfBoundsException();
		}
		array[index] = value;
	}
	
	public String getArray() {
		return Arrays.toString(array);
	}
	
	public void bubbleSort() {
		for(int i = 0 ; i < array.length - 1 ; i++) {
			for(int j = 0 ; j < array.length - (i+1) ; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}
