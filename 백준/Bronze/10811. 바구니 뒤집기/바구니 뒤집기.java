import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		
		int M = sc.nextInt();
		for(int x = 0; x < M; x++) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			while(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}