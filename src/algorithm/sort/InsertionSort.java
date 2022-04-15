package algorithm.sort;

import java.util.Arrays;

/*
 * 삽입 정렬 (Insertion Sort)
 * 삽입 정렬은 현재 비교하고자 하는 target(타겟)과 그 이전의 원소들과 비교하며 자리를 교환(swap)하는 정렬 방법
 * 
 * 거의 정렬 된 경우 매우 효율적이다. 즉, 최선의 경우 O(N)의 시간복잡도를 갖는다.
 * 역순에 가까울 수록 매우 비효율적이다. 즉, 최악의 경우 O(N2)의 시간 복잡도를 갖는다.
 * 데이터의 상태에 따라서 성능 편차가 매우 크다. 
 * 
 * Bubble Sort나 Selection Sort 와 이론상 같은 시간복잡도를 
 * 갖음에도 평균 비교 횟수에 대한 기대값이 상대적으로 적기 때문에 
 * 평균 시간복잡도가 O(N2) 인 정렬 알고리즘 중에서는 빠른편에 속하는 알고리즘
 */
public class InsertionSort {

	private static final int DEFAULT_ARRAY_LENGTH = 100;
	
	private int[] array;
	
	public InsertionSort() {
		this.array = new int[DEFAULT_ARRAY_LENGTH];
	}
	
	public InsertionSort(int[] a) {
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
	
	public void insertionSort() {
		for(int i = 1 ; i < array.length ; i++) {
			int target = array[i];
			int j = i - 1;
			while( j>=0 && target < array[j]) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = target;
		}
	}
}
