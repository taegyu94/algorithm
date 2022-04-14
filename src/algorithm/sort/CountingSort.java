package algorithm.sort;

import java.util.Arrays;

public class CountingSort {

	private static final int DEFAULT_ARRAY_LENGTH = 100;	//기본 array 길이 : 100 
	private static final int DEFAULT_COUNTING_LENGTH = 30;	// 기본counting 길이 : 30	 : 값의 범위
	
	private int[] array;
	private int[] counting;
	private int[] result;
	
	public CountingSort() {
		this.array = new int[DEFAULT_ARRAY_LENGTH];
		this.counting = new int[DEFAULT_COUNTING_LENGTH + 1];	// 0~ 30 
		this.result = new int[DEFAULT_ARRAY_LENGTH];
	}
	
	public CountingSort(int[] array, int numRange) {
		this.array = array;
		this.counting = new int[numRange+1];
		this.result = new int[array.length];
	}
	
	public void setIndexArray(int index, int value) {
		if(index < 0 || index >= array.length) {
			throw new IndexOutOfBoundsException();
		}
		array[index] = value;
	}
	
	public void setRandomArray() {
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = (int)(Math.random()*counting.length);
		}
	}
	
	public String getArray() {
		return Arrays.toString(array);
	}
	public String getCounting() {
		return Arrays.toString(counting);
	}
	public String getResult() {
		return Arrays.toString(result);
	}
	
	public void countingSort() {
		// 과정1
		for(int i = 0 ; i < array.length ; i++) {
			counting[array[i]]++;
		}
		
		//과정2 
		for(int i = 1 ; i < counting.length ; i++) {
			counting[i] = counting[i] + counting[i-1];
		}
		
		//과정3
		for(int i = array.length - 1 ; i >= 0 ; i--) {
			result[--counting[array[i]]] = array[i];
		}
	}
}
