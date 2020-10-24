package Q172;

public class Q172 {
	public static void main(String[] args) {
		int wd = 0;
		String[] days = {"sun", "mon", "wed", "sat"};
		for(String s: days) { //for each문 사용
			switch (s) { //switch문에 for each문을 통해 'dyas'에서 읽은 데이터 넘겨받음
			case "sat": // ↓
			case "sun": // s로 받은 days의 값이 "sat" 또는 "sun"이면 ↓ 코드 실행
				wd -= 1; //wd의 값을 1감소 시킨다.
				break; //switch문을 빠져나온다.
			case "mon": // s로 받은 days의 값이 "mon"이면 ↓ 코드 실행
				wd -=1; //wd의 값을 1감소 시킨다.
				break; //switch문을 빠져나온다.
			case "wed": // s로 받은 days의 값이 "wed"이면 ↓ 코드 실행
				wd += 2; //wd의 값을 1감소 시킨다. 그리고 더 이상의 case문이 없어서 switch문을 빠져나온다.
			}
			//System.out.println(s + " " + wd);
		}
		System.out.println(wd);
	}
}
