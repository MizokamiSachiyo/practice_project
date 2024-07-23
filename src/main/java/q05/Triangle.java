package q05;

public class Triangle {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int area = getTriangleArea(8, 5);

		System.out.println("底辺:8");
		System.out.println("高さ:5");
		System.out.println("三角形の面積:" + area);
	}

	public static int getTriangleArea(int a, int b) {
		return a * b / 2;
	}

}
