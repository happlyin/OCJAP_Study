package Q164;

class Student { //�л��� ������ ���̸� ������ �ִ� Ŭ����
	String name;
	int age;
}

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student(); //���� ���� Student ��ü �����Ѱ� s1 ����Ű���� ��
		Student s2 = new Student(); //���� ���� Student ��ü �����Ѱ� s2 ����Ű���� ��
		Student s3 = new Student(); //���� ���� Student ��ü �����Ѱ� s3 ����Ű���� ��
		s1 = s3; //s3�� ����ġ�� �ִ� ���� s1�� ����ġ���� ��
		s3 = s2; //s2�� ����ġ�� �ִ� ���� s3�� ����ġ���� ��
		s2 = null; //s2�� �ƹ��͵� ����ġ���� �ʴ� ���°� ��
		/*System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);*/
	}
}
