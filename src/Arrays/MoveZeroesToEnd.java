package Arrays;

public class MoveZeroesToEnd {
	
	public static void printArray(int[] arrayToPrint) {
		int n = arrayToPrint.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(arrayToPrint[i] + " ");
		}
		
		System.out.println();
	}
	
	// My implementation -----------------------------------------------------
	public static boolean unExpectedArray(int[] arr) {
		boolean heuristic = false;
		int positionFirstZero = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				positionFirstZero = i;
				break;
			}
		}
		
		if(positionFirstZero == arr.length - 1)
			return false;
		
		for(int i = positionFirstZero + 1; i < arr.length; i++) {
			if(arr[i] != 0) {
				heuristic = true;
				break;
			}
		}
		
		return heuristic;
	}
	
	public static void swapElement(int[] arr) {
		int temp1 = 0, temp2 = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] == 0) {
				temp1 = arr[i];
				temp2 = arr[i+1];
				arr[i] = temp2;
				arr[i+1] = temp1;
				//i++;
			}
		}
	}
	
	public static int[] moveZeroToEnd(int[] arr) {
		do {
			swapElement(arr);
		} while(unExpectedArray(arr));
		
		return arr;
	}
	// -----------------------------------------------------------------------
	
	
	// Dinesh implementation -------------------------------------------------
	public static void moveZeros(int[] arr, int n) {
		int j = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(arr[j] != 0) {
				j++;
			}
		}
	}
	// -----------------------------------------------------------------------
	
	public static void main(String[] args) {
		double now = System.currentTimeMillis();
		
		int[] numbers = {0, 1, 0, 2, 1, 0, 3, 0, 5, 0, 0, 10};
		printArray(moveZeroToEnd(numbers));
	
		//moveZeros(numbers, numbers.length);
		//printArray(numbers);
		
		System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " millisecs");
	}

}
