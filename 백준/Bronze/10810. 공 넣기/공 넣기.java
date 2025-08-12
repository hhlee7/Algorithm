import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N];

		int i, j, k = 0;
		
		for(int x = 0; x < M; x++) {
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();
			for(int y = i - 1; y < j; y++) {
				arr[y] = k;
			}
		}
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}