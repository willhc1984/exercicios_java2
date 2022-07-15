package TestesDIO;

import java.util.Scanner;

public class teste3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number, id;

		number = sc.nextInt();
		id = sc.nextInt();

		int count = 0;
		while (number > 0) {

			int id1, num;

			id1 = sc.nextInt();
			num = sc.nextInt();

			if (id == id && num == 0) {
				count++;
			}

			number--;
		}
		System.out.println(count);

	}

}
