// Java Heap Sort program 
public class HeapSort {
	public void sort(int arr[])
	{
		int n = arr.length;

	
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		
		for (int i = n - 1; i > 0; i--) {
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			
			heapifyyy(arr, i, 0);
		}
	}


	void heapifyyy(int array[], int n, int i)
	{
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1
		int r = 2 * i + 2; // right = 2*i + 2

	
		if (l < n && array[l] > array[largest])
			largest = l;

		
		if (r < n && array[r] > array[largest])
			largest = r;

	if (largest != i) {
			int swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;

			
			heapify(array, n, largest);
		}
	}

	
	static void printArray(int array[])
	{
		int n = array.length;
		for (int i = 0; i < n; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	
	public static void main(String args[])
	{
		int array[] = { 15,5,48,158,1545,33,666,111, 7 };
		int n = array.length;

		HeapSort ob = new HeapSort();
		ob.sort(array);

		System.out.println("Sorted array is");
		printArray(array);
	}
}
