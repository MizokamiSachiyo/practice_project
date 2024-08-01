package method.q07;

public class SumNumbers2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int intNum = 5;
		double doubleNum = 3.3;
		int sum = calculateSum(intNum, doubleNum);

		System.out.println("第一引数(整数):" + intNum);
		System.out.println("第二引数(実数):" + doubleNum);
		System.out.println("加算結果:" + sum);
	}

	public static int calculateSum(int intNum, double doubleNum) {
		return (int) (intNum + doubleNum);
	}

}
