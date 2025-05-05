import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		String B = sc.next();
		int b1 = B.charAt(2) - '0';
		int b10 = B.charAt(1) - '0';
		int b100 = B.charAt(0) - '0';
		
		System.out.println(A * b1);
		System.out.println(A * b10);
		System.out.println(A * b100);
		System.out.println(A * Integer.parseInt(B));
		
		sc.close();
	}
}