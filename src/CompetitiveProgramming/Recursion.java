package CompetitiveProgramming;
import java.util.Scanner;

public class Recursion {
	
	public static int recursiveSum(Scanner sc, int n) {
        if (n == 0) return 0; 
        int num = sc.nextInt();
        return num + recursiveSum(sc, n - 1);
    }
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            int sum = recursiveSum(sc, N);

            System.out.println(sum);
        }

        sc.close();
    }

}
