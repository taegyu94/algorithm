package algorithm.sort;

import java.util.Arrays;


/*
 *  CountingSort  
 *  시간 복잡도 : O(n)
 *  정렬 시간은 매우 빠르나,
 *  특정 타입에 한되어 있고,
 *  값의 범위에 따라 메모리 낭비가 발생할 수 있기 때문에
 *  잘 사용되지는 않는다.
 */
public class CountingSort {

	private static final int DEFAULT_ARRAY_LENGTH = 100;	//기본 array 길이 : 100 
	private static final int DEFAULT_COUNTING_LENGTH = 30;	// 기본counting 길이 : 30	 : 값의 범위
	
	private int[] array;
	private int[] counting;
	private int[] result;
	
	// 기본 생성자.
	public CountingSort() {
		this.array = new int[DEFAULT_ARRAY_LENGTH];
		this.counting = new int[DEFAULT_COUNTING_LENGTH + 1];	// 0~ 30 
		this.result = new int[DEFAULT_ARRAY_LENGTH];
	}
	
	// 특정 array와 값의 범위를 입력받은 경우 
	public CountingSort(int[] array, int numRange) {
		this.array = array;
		this.counting = new int[numRange+1];
		this.result = new int[array.length];
	}
	
	// 특정 index에 값 추가 
	public void setIndexArray(int index, int value) {
		if(index < 0 || index >= array.length) {
			throw new IndexOutOfBoundsException();
		}
		array[index] = value;
	}
	
	// array에 랜덤 값으로 설정. 
	public void setRandomArray() {
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = (int)(Math.random()*counting.length);
		}
	}
	
	// getter 
	public String getArray() {
		return Arrays.toString(array);
	}
	public String getCounting() {
		return Arrays.toString(counting);
	}

	public String getResult() {
		return Arrays.toString(result);
	}
	
	// CountingSort 
	public void countingSort() {
		
		// 과정1
		// array 를 한 번 순회하면서 각 값이 나올 때마다 해당 값을 index 로 하는 새로운 배열(counting)의 값을 1 증가.
		for(int i = 0 ; i < array.length ; i++) {
			counting[array[i]]++;
		}
		
		//과정2 
		// counting 배열의 각 값을 누적합으로 변환.
		for(int i = 1 ; i < counting.length ; i++) {
			counting[i] = counting[i] + counting[i-1];
		}
		
		//과정3
		/*
		 * counting 배열의 각 값은 (시작점 - 1)을 알려준다
		 * 해당 값에 대응되는 위치에 배정하면 된다는 의미다.
		 * array[0] = 7 이고, counting[7] = 12 이다. 
		 * 여기서 counting[7] 의 값에 1 을 빼준 뒤 해당 값이 새로운 배열의 인덱스 11에 위치하게 된다.
		 * 안정적으로 정렬하기 위해서는 array의 마지막 index 부터 순회하는 것이 좋다.
		 */
		for(int i = array.length - 1 ; i >= 0 ; i--) {
			//result[--counting[array[i]]] = array[i];
			int value = array[i];
			counting[value]--;
			result[counting[value]] = value;
		}
	}
}
