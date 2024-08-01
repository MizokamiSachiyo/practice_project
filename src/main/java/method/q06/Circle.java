package method.q06;

public class Circle {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double radius = 5.0;
		double area = getCircleArea(radius);

		System.out.println("半径:" + radius);
		System.out.println("円の面積:" + area);
	}

	public static double getCircleArea(double radius) {
		final double PI = 3.14;
		return PI * radius * radius;
	}

}
