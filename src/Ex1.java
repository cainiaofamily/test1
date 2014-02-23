import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("请输入一个数字");
		Scanner input = new Scanner(System.in);
		int sum = input.nextInt();
		if ((sum % 10 == 2) || (sum % 10 == 4)) {

			System.out.println("恭喜您获得一等奖");

		} else if (sum % 10 == 3 || sum % 10 == 5 || sum % 10 == 7) {

			System.out.println("恭喜您获得二等奖");

		} else {
			System.out.println("谢谢您，请您下次再来");
		}
	}
}
