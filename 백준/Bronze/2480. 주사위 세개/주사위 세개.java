import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		
		int prize = 0;
		
		// 세 개 다 같은 경우
		if(dice1 == dice2 && dice2 == dice3) {
			prize = 10000 + (dice1 * 1000);
			
		// 주사위 1, 2가 같거나 1, 3이 같은 경우
		} else if(dice1 == dice2 || dice1 == dice3) {
			prize = 1000 + (dice1 * 100);
			
		// 주사위 2, 3 이 같은 경우
		} else if(dice2 == dice3) {
			prize = 1000 + (dice2 * 100);
		
		// 주사위 셋 다 다른 경우
		} else {
			int max = Math.max((Math.max(dice1, dice2)), dice3);
			prize = max * 100;
		}
		
		System.out.println(prize);
	}
}