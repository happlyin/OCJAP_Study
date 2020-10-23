package Q169;

public class SumTest {
	public static void doSum(Integer x, Integer y) {
		System.out.println("Integer sum is " + (x + y));
	}
	public static void doSum(double x, double y) {
		System.out.println("double sum is " + (x + y));
	}
	public static void doSum(float x, float y) {
		System.out.println("float sum is " + (x + y));
	}
	public static void doSum(int x, int y) {
		System.out.println("int sum is " + (x + y));
	}
	public static void main(String[] args) {
		doSum(10, 20);
		doSum(10.0, 20.0);
	}
	// int -> float -> double 순서로 자동으로 캐스팅이 일어나고
	// Integer는 Integer 생성해서 인자값으로 넘기면 된다.
}
