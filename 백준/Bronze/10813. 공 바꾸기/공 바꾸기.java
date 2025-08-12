import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[] = new int[N];

		for(int x = 0; x < N; x++) {
			arr[x] = x + 1;
		}
		
		int temp = 0;
		for(int y = 0; y < M; y++) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}