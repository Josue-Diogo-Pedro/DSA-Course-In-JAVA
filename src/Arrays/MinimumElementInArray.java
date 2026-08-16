package Arrays;

public class MinimumElementInArray {

	public static int findMinimum(int[] arr) {
		
		if(arr == null || arr.length == 0)
			throw new IllegalArgumentException("Invalid Input");
		
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++)
			if(arr[i] < min)
				min = arr[i];
		
		return min;
	}
	
	public static void main(String[] args) {
		int[] numbers = {5, 9, 3, 15, 8, 2};
		
		int[] teste = new int[0];
		
		System.out.println(findMinimum(numbers));
	}

}
