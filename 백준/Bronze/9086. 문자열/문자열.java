import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < T; i++) {
			String s = sc.nextLine();
			System.out.print(s.charAt(0));
			System.out.print(s.charAt(s.length() - 1));
			System.out.println();
		}
	}
}