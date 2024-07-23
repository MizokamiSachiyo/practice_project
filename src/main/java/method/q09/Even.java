package method.q09;

public class Even {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num1 = 10;
		int num2 = 5;

		if (checkEven(num1)) {
			System.out.println(num1 + "は偶数です。");
		} else {
			System.out.println(num1 + "は奇数です。");
		}

		if (checkEven(num2)) {
			System.out.println(num2 + "は偶数です。");
		} else {
			System.out.println(num2 + "は奇数です。");
		}
	}

	public static boolean checkEven(int num) {
		return num % 2 == 0;
	}

}
