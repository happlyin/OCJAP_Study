package Q166;

import java.time.LocalDate;

public class Q166 {
	public static void main(String[] args) { //���ι� ����
		LocalDate data = LocalDate.of(2012, 01, 32); //����
		//��¥�� 1���� 31������ �� �� �ִµ� 32�̸� �Է��ؼ� ������ ����.
		data.plusDays(10); //10�� �Ŀ� ��¥�� ���Ѵ�.
		System.out.println(data); //data�� ����Ѵ�.
	}
}
