package Arrays;

public class ReverseArray {
	
	public static void printArray(int[] arrayToPrint) {
		int n = arrayToPrint.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(arrayToPrint[i] + " ");
		}
		
		System.out.println();
	}
	
	public static int[] reverseArray(int[] arr, int start, int end) {
		int temp = 0;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] numbers = {2, 11, 5, 10, 7, 8};
		printArray(numbers);
		printArray(reverseArray(numbers, 0, numbers.length-1));
	}

}
