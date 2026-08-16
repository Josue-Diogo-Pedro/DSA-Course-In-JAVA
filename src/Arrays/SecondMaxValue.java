package Arrays;

public class SecondMaxValue {
	
	//my implementation
	public int printSecMaxValue(int[] arr) {
		if(arr.length == 0 || arr == null)
			throw new IllegalArgumentException("Invalid input");
		
		int max = 0, second = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				second = max;
				max = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > second && arr[i] != max)
				second = arr[i];
		}
		
		return second;
	}
	
	//Dinesh implementation
	public int findSecondMax(int[] arr) {
		if(arr.length == 0 || arr == null)
			throw new IllegalArgumentException("Invalid input");
		
		int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				second = max;
				max = arr[i];
			} else if(arr[i] > second && arr[i] != max) {
				second = arr[i];
			}
		}
		
		return second;
	}
	
	public static void main(String[] args) {
		int[] numbers = {12, 34, 2, 34, 33, 1};
		SecondMaxValue second = new SecondMaxValue();
		System.out.println(second.printSecMaxValue(numbers));
		
		//System.out.println(second.findSecondMax(numbers));
	}

}
