package Q166;

import java.time.LocalDate;

public class Q166 {
	public static void main(String[] args) { //메인문 시작
		LocalDate data = LocalDate.of(2012, 01, 32); //에러
		//날짜에 1부터 31까지만 들어갈 수 있는데 32이를 입력해서 오류가 난다.
		data.plusDays(10); //10일 후에 날짜를 말한다.
		System.out.println(data); //data를 출력한다.
	}
}
