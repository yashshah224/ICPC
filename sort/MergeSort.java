import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		int array[] = {2, 45, 32, 51, 9, 63, 10, 31, 6, 5, 12, 90};
		
		System.out.println("Unordered array: \n" + Arrays.toString(array));
		
		sort(array, 0, array.length - 1);
		
		System.out.println("\nOrdered array: \n" + Arrays.toString(array));
		
	}
	
	private static void sort(int array[], int firstIndex, int lastIndex) {
		if(firstIndex < lastIndex) {
			int midIndex = (firstIndex + lastIndex) / 2;
			
			//Sort each half of the array
			sort(array, firstIndex, midIndex);
			sort(array, midIndex + 1, lastIndex);
			
			//Merge the halves of the array
			merge(array, firstIndex, midIndex, lastIndex);
		}
	}
	
	private static void merge(int array[], int firstIndex, int midIndex, int lastIndex) {
		
		//Create subarrays
		int sizeSubArray1 = midIndex - firstIndex + 1;
		int sizeSubArray2 = lastIndex - midIndex;
		
		int subArray1[] = new int[sizeSubArray1];
		int subArray2[] = new int[sizeSubArray2];
		
		for(int i = 0; i < sizeSubArray1; i++) {
			subArray1[i] = array[firstIndex + i];
		}
		for(int i = 0; i < sizeSubArray2; i++) {
			subArray2[i] = array[midIndex + 1 + i];
		}
		
		//Merge subarrays
		int i = 0, j = 0;
		int k = firstIndex;
		
		while(i < sizeSubArray1 && j < sizeSubArray2) {
			//if the value of the first array is lower add it to the array
			if(subArray1[i] <= subArray2[j]) {
				array[k] = subArray1[i];
				i++;
			}
			//otherwise add the value of the second array
			else {
				array[k] = subArray2[j];
				j++;
			}
			k++;
		}
		
		//If there are remaining values copy them to the array
		while(i < sizeSubArray1) {
			array[k] = subArray1[i];
			i++;
			k++;
		}
		
		while(j < sizeSubArray2) {
			array[k] = subArray2[j];
			j++;
			k++;
		}
		
	}

}
