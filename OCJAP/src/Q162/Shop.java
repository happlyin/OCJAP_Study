package Q162;

public class Shop {
	public static void main(String[] args) { //메인시작
		int price = 1000; //price에 100저장
		int qty = 2; //qty에 2저장
		String grade = "2"; //"2"를 grade가 가르키토록 함
		double discount = 0.0; //discount에 0.0저장
		
		switch (grade) { //스위치문 grade가 문자열이여서 가능
		case "1": //grade가 1이라면
			discount = price * 0.1; //discount에 연산해서 값 넣기
			break; //스위치문 멈추기
		case "2": //grade가 2이라면
			discount = price * 0.5; //discount에 연산해서 값 넣기
			//continue;
			/*다시 11번 라인으로 가기 -> 무한반복으로 이어짐
			-> 루프를 나오지 못하는 에러 발생(오류는 25~28라인 참고)
			break으로 수정하면 오류가 나지 않음*/
		default: //grade가 1도 아니고 2도 아니라면
			System.out.println("Thank You!"); //출력후 멈추기
		}
		System.out.println(discount);
	}
}

/*
 Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	continue cannot be used outside of a loop
	
	at Q162.Shop.main(Shop.java:16)
 */