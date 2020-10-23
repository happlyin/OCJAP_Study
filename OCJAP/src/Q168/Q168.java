package Q168;

import java.time.LocalDate;

public class Q168 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2012, 01, 30);
		date.plusDays(10); //값 자체를 바꾸는 것이 아닌 연산해서 리턴만 함
		System.out.println(date); // 그래서 출력하면 그대로
		
		date = date.plusDays(10); //리턴받을 값을 다시 자신에 넣어야 값이 변경됨
		System.out.println(date);
	}
}
