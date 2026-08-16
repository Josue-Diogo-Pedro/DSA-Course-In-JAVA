package CompetitiveProgramming;

import java.util.Scanner;

public class Fibo {
	
	public static int fiboSum(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fiboSum(n - 1) + fiboSum(n - 2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fiboSum(N));
	}

}
