package Q167;

public class Q167 {
	public static void main(String[] args) {
		String stuff = "TV";
		String res = null;
		if(stuff.equals("TV")) {
			res = "Walter";
		} else if (stuff.equals("Movie")) {
			res = "White";
		} else {
			res = "No Result";
		}
		System.out.println(res);
		res = null;
		res = stuff.equals("TV") ? "Walter" : stuff.equals("White") ? "White" : "No Result";
		System.out.println(res);
	}
}
/*
 	삼항연산자 A ? B : C
 	A : true or false으로 나올 수 있는 모든 것
 	B : A의 값이 true일 때 B실행
 	C : A의 값이 true일 때 B실행
 */