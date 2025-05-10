import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] nums = new int[N];
		for(int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		int counts = 0;
		for(int j = 0; j < N; j++) {
			if(v == nums[j]) {
				counts += 1;
			}
		}
		System.out.println(counts);
	}
}