package Q178;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q178 {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
		dt.plusDays(30); //날짜를 더하는 연산을 하는데 값을 바꾸는 것이 아니라 리턴
		dt.plusMonths(1); //달을 더하는 연산을 하는데 값을 바꾸는 것이 아니라 리턴
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
		//그래서 출력하면 2014-07-31T01:01:00
	}
}
