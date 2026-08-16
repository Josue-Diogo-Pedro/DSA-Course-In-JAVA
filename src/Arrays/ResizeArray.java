package Arrays;

public class ResizeArray {
	
	private static void resize(int[] arr, int capacity) {
		int[] temp = new int[capacity];
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		
		arr = temp;
	}
	
	private static void printArray(int[] arrayToPrint) {
		int n = arrayToPrint.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(arrayToPrint[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 9, 3, 10};
		
		resize(arr, arr.length*2);
		
		printArray(arr);
	}

}
