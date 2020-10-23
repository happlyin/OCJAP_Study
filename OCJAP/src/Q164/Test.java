package Q164;

class Student { //학생의 정보와 나이를 가지고 있는 클래스
	String name;
	int age;
}

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student(); //힙에 새로 Student 객체 생성한걸 s1 가르키도록 함
		Student s2 = new Student(); //힙에 새로 Student 객체 생성한걸 s2 가르키도록 함
		Student s3 = new Student(); //힙에 새로 Student 객체 생성한걸 s3 가르키도록 함
		s1 = s3; //s3가 가르치고 있는 것을 s1도 가르치도록 함
		s3 = s2; //s2가 가르치고 있는 것을 s3도 가르치도록 함
		s2 = null; //s2는 아무것도 가르치지는 않는 상태가 됨
		/*System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);*/
	}
}
