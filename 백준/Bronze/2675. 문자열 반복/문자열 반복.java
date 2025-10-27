import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		StringBuilder out = new StringBuilder();
		while (T-- > 0) {
			int R = sc.nextInt();
			String S = sc.next();

			StringBuilder line = new StringBuilder();
			for (char ch : S.toCharArray()) {
				line.append(String.valueOf(ch).repeat(R));
			}
			out.append(line).append('\n');
		}
		System.out.print(out.toString());
		sc.close();
	}
}