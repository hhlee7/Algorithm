import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		
		int sum = 0;
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = str.charAt(i) - '0';
			sum += arr[i];
		}

		System.out.println(sum);

		sc.close();
	}
}