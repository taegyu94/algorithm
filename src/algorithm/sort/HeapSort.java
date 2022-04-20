package algorithm.sort;

import java.util.Arrays;


/*
 *	HeapSort
 *	Heap 자료구조를 기반으로 구현한 정렬 알고리즘
 *	힙은 '최솟값 또는 최댓값을 빠르게 찾아내기 위해 완전이진트리 형태로 만들어진 자료구조'
 *	시간 복잡도 : O(NlogN)
 *
	[장점]
1. 최악의 경우에도 **O(NlogN)** 으로 유지가 된다.
2. 힙의 특징상 부분 정렬을 할 때 효과가 좋다.
	[단점]
1. 일반적인 **O(NlogN)** 정렬 알고리즘에 비해 성능은 약간 떨어진다.
2. 한 번 최대힙을 만들면서 불안정 정렬 상태에서 최댓값만 갖고 정렬을 하기 때문에 안정정렬이 아니다.
 */
public class HeapSort {

	private static final int DEFAULT_ARRAY_LENGTH = 100;
	
	private int[] array;
	
	public HeapSort() {
		this.array = new int[DEFAULT_ARRAY_LENGTH];
	}
	
	public HeapSort(int[] a) {
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
	
	public void heapSort(int mode) {
		if(mode < 0 || mode > 1) {
			System.out.println("mode 값을 잘못 입력하셨습니다. 0 : UpDown , 1 : DownUp");
			return;
		}
		if(array.length < 2) {
			System.out.println("배열의 크기가 2 미만입니다.");
			return;
		}
		
		// 마지막 요소의 부모노드 
		int parentIdx = getParent(array.length - 1);
		
		for(int i = parentIdx ; i >= 0 ; i--) {
			if(mode == 0) {
				heapifyUpDown(array, i, array.length - 1);		
			}
			else {
				heapifyDownUp(array, i, array.length - 1);
				//System.out.println("나 실행됨?  i : " + i );
			}
		}
		
		//System.out.println( getArray());
		
		for(int i = array.length - 1 ; i > 0 ; i--) {
			if(mode == 0) {
				swap(array, 0, i);
				heapifyUpDown(array, 0, i-1);
			}
			else {
				swap(array, 0, i);
				heapifyDownUp(array, 0, i-1);
			}
		}
	}
	
	private int getParent(int child) {
		return (child-1)/2;
	}
	
	private void swap(int[] a , int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	private void heapifyUpDown(int[]a , int parentIdx , int lastIdx) {
		int leftChildIdx = parentIdx*2 + 1;
		int rightChildIdx = parentIdx*2 + 2;
		int largestIdx = parentIdx;			// 현재 부모노드가 가장 큰 값이라고 가정, 
//		System.out.println("leftChildIdx : " + leftChildIdx);
//		System.out.println("rightChildIdx : " + rightChildIdx);
//		System.out.println("largestIdx : " + largestIdx);
		
		
		if(leftChildIdx <= lastIdx && a[largestIdx] < a[leftChildIdx]) {
			largestIdx = leftChildIdx;
		}
		
		if(rightChildIdx <= lastIdx && a[largestIdx] < a[rightChildIdx]) {
			largestIdx = rightChildIdx;
		}
		
		//  교환이발생함.
		if(parentIdx != largestIdx){
			swap(a,parentIdx,largestIdx);
			heapifyUpDown(a, largestIdx, lastIdx);
		}
	}
	
	private void heapifyDownUp(int[]a , int parentIdx , int lastIdx) {
		int leftChildIdx;
		int rightChildIdx;
		int largestIdx;
		
		while((parentIdx*2)+1 <= lastIdx) {
			leftChildIdx = (parentIdx*2)+1 ;
			rightChildIdx = (parentIdx*2)+2 ;
			largestIdx = parentIdx;
			
			if(a[largestIdx] < a[leftChildIdx]) {
				largestIdx = leftChildIdx;
			}
			
			if(rightChildIdx <= lastIdx && a[largestIdx] < a[rightChildIdx]) {
				largestIdx = rightChildIdx;
			}
			
			/*
	         * 교환이 발생했을 경우 두 원소를 교체 한 후
	         * 교환이 된 자식노드를 부모 노드가 되도록 교체한다. 
	         */
			if(parentIdx!=largestIdx) {
				swap(a,largestIdx,parentIdx);
				parentIdx = largestIdx;
			}
			else {
				return;
			}
		}
		
	}
}
