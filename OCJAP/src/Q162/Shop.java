package Q162;

public class Shop {
	public static void main(String[] args) { //���ν���
		int price = 1000; //price�� 100����
		int qty = 2; //qty�� 2����
		String grade = "2"; //"2"�� grade�� ����Ű��� ��
		double discount = 0.0; //discount�� 0.0����
		
		switch (grade) { //����ġ�� grade�� ���ڿ��̿��� ����
		case "1": //grade�� 1�̶��
			discount = price * 0.1; //discount�� �����ؼ� �� �ֱ�
			break; //����ġ�� ���߱�
		case "2": //grade�� 2�̶��
			discount = price * 0.5; //discount�� �����ؼ� �� �ֱ�
			continue; /*�ٽ� 11�� �������� ���� -> ���ѹݺ����� �̾���
			-> ������ ������ ���ϴ� ���� �߻�(������ 25~28���� ����)
			break���� �����ϸ� ������ ���� ����*/
		default: //grade�� 1�� �ƴϰ� 2�� �ƴ϶��
			System.out.println("Thank You!"); //����� ���߱�
		}
		System.out.println(discount);
	}
}

/*
 Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	continue cannot be used outside of a loop
	
	at Q162.Shop.main(Shop.java:16)
 */