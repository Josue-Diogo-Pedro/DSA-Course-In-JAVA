package Arrays;

public class FindMissingNumberInArray {
	
	private static int findMissingNumber(int[] arr){
		int n = arr.length + 1;
		int sum = n*(n+1)/2;
		for(int num : arr) {
			sum = sum - num;
		}
		
		return sum;
	}
	
	private static void printArray(int[] arrayToPrint) {
		int n = arrayToPrint.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(arrayToPrint[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 4, 1, 8, 6, 3, 7};
		System.out.println(findMissingNumber(arr));

	}

}
