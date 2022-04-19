package algorithm.sort;

import java.util.Arrays;


/*
 * Shell 정렬
 * 셸 정렬의 전체적인 과정은 이렇다. (오름차순을 기준으로 설명)
 *	1. 간격(gap)을 설정한다.
 *	2. 각 간격별로 분류 된 서브(부분) 리스트에 대해 삽입정렬을 한다.
 *	3. 각 서브(부분) 리스트의 정렬이 끝나면 간격을 줄인다.
 *	4. 간격이 1이 될 때 까지 2번 과정으로 되돌아가며 반복한다.
 *
 *	시간복잡도
 *	최상의 경우 O(NlogN)
 *	최악의 경우 O(N^2)
 */
public class ShellSort {

	private static final int DEFAULT_ARRAY_LENGTH = 100;
	private static final int[] gapSequen = { 1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937, 
			8858, 19930, 44842, 100894, 227011, 510774,
			1149241, 2585792, 5818032, 13090572, 29453787, 
			66271020, 149109795, 335497038, 754868335, 1698453753};
	
	
	private int[] array;
	
	public ShellSort() {
		this.array = new int[DEFAULT_ARRAY_LENGTH];
	}
	
	public ShellSort(int[] a) {
		this.array = a;
	}
	
	public void setArrayRandom() {
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = (int)(Math.random()*array.length);
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
	
	public static int getGap(int length) {
		int index = 0;
		for(int i = 0 ; i < gapSequen.length ; i++) {
			if(gapSequen[i] > length) {
				index = i - 1;
				break;
			}
		}
		return index;
	}
	public void shellSort() {
		int gapIndex = getGap(array.length);
		while(gapIndex >= 0) {
			int gap = gapSequen[gapIndex];
			for(int i =  gap; i < array.length ; i++) {
				for(int j = i ; j >= gap && array[j] < array[j-gap] ; j -= gap) {
					int temp = array[j];
					array[j] = array[j-gap];
					array[j-gap] = temp;
				}
			}
			gapIndex--;
		}
	}
	
	
}
