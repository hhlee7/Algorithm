import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[][] A = new int[N][M];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                A[i][j] = sc.nextInt();

        for (int i = 0; i < N; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < M; j++) {
                int v = sc.nextInt();
                row.append(A[i][j] + v);
                if (j + 1 < M) row.append(' ');
            }
            System.out.println(row);
        }
	}
}