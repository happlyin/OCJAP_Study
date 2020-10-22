package Q165;

public class Q165 {
	public static void main(String[] args) {
		String[] name = {"Thomas", "Peter", "Joseph"};
		String[] pwd = new String[3];
		int idx = 0;
		try {
			for(String n : name) {
				pwd[idx] = n.substring(2, 6);
				/*
				 스트링 자르기 : substring
				 리턴값 : String
				 첫번째 인자값 : 시작하는 인덱스(0부터 시작)
				 두번째 인자값 : 입력값보다 한칸 앞에까지
				 */
				/*
				 두번째 n.substring(2, 6)을 실행하면 catch에 걸린다.
				 그 이유는 최소 글자수가 6자여야 하는데 Peter는 5자 이다.
				 따라서 자를 수 없어 예외가 발생하고 캐치문에 걸려서
				 "omas
				 Invalid Name"이 출력된다.
				 */
				System.out.println(pwd[idx]);
				idx++;
			}
		}
		catch (Exception e) {
			System.out.println("Invalid Name");
		}
	}
}

