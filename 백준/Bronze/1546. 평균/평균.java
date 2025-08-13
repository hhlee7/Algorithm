import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double arr[] = new double[N];
		double max = Integer.MIN_VALUE;
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) max = arr[i]; 
		}
		
		for(int i = 0; i < N; i++) {
			arr[i] = arr[i] / max * 100;
		}
		
		double sum = 0;
		for(double num : arr) {
			sum += num;
		}
		
		double avg = sum / N;
		
		System.out.println(avg);
	}
}