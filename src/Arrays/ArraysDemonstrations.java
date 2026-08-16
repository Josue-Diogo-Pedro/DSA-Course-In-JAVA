package Arrays;

public class ArraysDemonstrations {
	
	public static void printArray(int[] arrayToPrint) {
		int n = arrayToPrint.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(arrayToPrint[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3, 2, 4, 7, 10, 6, 5};
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
		
		System.out.println();
	}

}
