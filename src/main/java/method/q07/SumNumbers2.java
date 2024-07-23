package method.q07;

public class SumNumbers2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int intnum = 5;
		double doublenum = 3.3;
		int sum = calculateSum(intnum, doublenum);

		System.out.println("第一引数(整数):" + intnum);
		System.out.println("第二引数(実数):" + doublenum);
		System.out.println("加算結果:" + sum);
	}

	public static int calculateSum(int intnum, double doublenum) {
		return (int) (intnum + doublenum);
	}

}
