import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("������һ������");
		Scanner input = new Scanner(System.in);
		int sum = input.nextInt();
		if ((sum % 10 == 2) || (sum % 10 == 4)) {

			System.out.println("��ϲ�����һ�Ƚ�");

		} else if (sum % 10 == 3 || sum % 10 == 5 || sum % 10 == 7) {

			System.out.println("��ϲ����ö��Ƚ�");

		} else {
			System.out.println("лл���������´�����");
		}
	}
}
