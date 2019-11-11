// 0 index based heap
public class MaxHeap {

	private int[] heapArr;
	private int heapSize;
	private int maxSize;
	
	public MaxHeap(int[] arr) {
		this.heapArr = arr;
		this.heapSize = this.maxSize= arr.length;
		if (arr.length > 1) {
			buildHeap(arr);
		}
	}

	private void buildHeap(int[] arr) {
		int lastIdx = arr.length - 1;
		for (int i = parent(lastIdx); i >= 0; i--) {
			siftDown(i);
		}
	}

	public int max() {
		if(heapArr.length <= 0) {
			throw new RuntimeException("heap is empty/underflow");
		}
		return heapArr[0];
	}

	public int deleteMax() {
		if(heapArr.length <= 0) {
			throw new RuntimeException("heap is empty/underflow");
		}
		int max = heapArr[0];
		heapArr[0] = heapArr[heapSize-1];
		heapSize--;
		siftDown(0);
		return max;
	}
	
	public void insert(int num) {
		if(heapSize >= maxSize) {
			throw new RuntimeException("heap is full/overflow");
		}
		heapSize++;
		heapArr[heapSize-1] = num;
		siftUp(heapSize-1);
	}
	
	public int size() {
		return heapSize;
	}
	
	private void siftUp(int i) {
		int value = heapArr[i];
		int parent = parent(i);

		while (i > 0 && heapArr[parent] < value) {
			heapArr[i] = heapArr[parent];
			i = parent;
			parent = parent(i);
		}

		heapArr[i] = value;

	}

	private void siftDown(int i) {

		int lastIdx = heapSize - 1;
		int largest = -1;

		while (true) {
			largest = i;
			int left = left(i);
			int right = right(i);

			if (left <= lastIdx && heapArr[largest] < heapArr[left]) {
				largest = left;
			}
			if (right <= lastIdx && heapArr[largest] < heapArr[right]) {
				largest = right;
			}
			
			if(i == largest) {
				break;
			}
			
			// swap
			int temp = heapArr[i];
			heapArr[i] = heapArr[largest];
			heapArr[largest] = temp;
			
			i = largest;
			
		}

	}

	private int left(int p) {
		return 2 * p + 1;
	}

	private int right(int p) {
		return 2 * p + 2;
	}

	private int parent(int c) {
		return (c - 1) / 2;
	}

	public static void main(String[] args) {
		int arr[] = { 50,40,30,1,2,3,100,400,250};
		MaxHeap maxHeap = new MaxHeap(arr);
		while(maxHeap.size() > 4) {
			System.out.println(maxHeap.deleteMax());
		}
		maxHeap.insert(51);
		maxHeap.insert(52);
		maxHeap.insert(60);
		maxHeap.insert(58);
		maxHeap.insert(59);
		
		while(maxHeap.size() > 0) {
			System.out.println(maxHeap.deleteMax());
		}
	}

}
