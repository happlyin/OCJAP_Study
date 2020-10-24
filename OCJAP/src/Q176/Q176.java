package Q176;

public class Q176 {
	public static void main(String[] args) {
		String str = "Sweet Sweat";
		String str2 = str.trim().charAt(6) + "" + str.indexOf("Sw", 1);
		System.out.println(str2);
	}
}
// trim() : 양 옆에 있는 공백을 제거한 값을 String형으로 리턴한다.
// charAt(int index) : String값의 인덱스 번호를 받아서 그 인덱스의 있는 String값을 char형으로 리턴한다.
// indexOf(String find, int numbers) : 찾고하는 스팅링 값과 몇번째 나오는 건지 주면 그게 어디인지 인덱스 값을 넘겨준다.
// 이 때 두번째 인자값 int형은 첫번째가 0, 두번째가 1 이런 식으로 된다.