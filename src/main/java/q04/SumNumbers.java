package q04;

public class SumNumbers {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] num = { 3, 2 };
		int sum = calculateSum(num);

		System.out.println("第一引数:" + num[0]);
		System.out.println("第二引数:" + num[1]);
		System.out.println("加算結果:" + sum);
	}

	public static int calculateSum(int[] num) {
		return num[0] + num[1];
	}

}
